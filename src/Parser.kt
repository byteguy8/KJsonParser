class Parser {
    private var current = 0
    private var tokens = emptyList<Token>()

    private fun errorStr(message: String): String {
        if (current >= tokens.size)
            return "Parsing error at end: $message"

        val token = peek()

        return "Parsing error at line ${token.line} (Related token '${token.lexeme}'): $message"
    }

    private fun peek() = tokens[current]

    private fun advance() = tokens[current++]

    private fun previous() = tokens[current - 1]

    private fun check(type: TokenType) = peek().type == type

    private fun match(vararg types: TokenType): Boolean {
        val token = peek()

        for (type in types) {
            if (type == token.type) {
                advance()
                return true
            }
        }

        return false
    }

    private fun consume(type: TokenType, errMessage: String): Token {
        val token = peek()

        if (token.type == type) {
            advance()
            return token
        }

        throw KJsonParserError(errorStr(errMessage))
    }

    private fun parseJson(): JsonElement {
        return parseArray()
    }

    private fun parseArray(): JsonElement {
        if (match(TokenType.LEFT_SQUARE)) {
            val values = mutableListOf<JsonElement>()

            if (!check(TokenType.RIGHT_SQUARE)) {
                do {
                    values.add(parseArray())
                } while (match(TokenType.COMMA))
            }

            consume(TokenType.RIGHT_SQUARE, "Expect ']' at end of json array")

            return JsonArray(values.toTypedArray())
        }

        return parseObject()
    }

    private fun parseObject(): JsonElement {
        if (match(TokenType.LEFT_BRACKET)) {
            val values = mutableListOf<JsonKeyValue>()

            if (!check(TokenType.RIGHT_BRACKET)) {
                do {
                    values.add(parseKeyValue())
                } while (match(TokenType.COMMA))
            }

            consume(TokenType.RIGHT_BRACKET, "Expect '}' at end of json object")

            return JsonObject(values.toTypedArray())
        }

        return parseValue()
    }

    private fun parseKeyValue(): JsonKeyValue {
        val key = consume(TokenType.STRING, "Expect string as key")
        consume(TokenType.COLON, "Expect ':' key value")
        val value = parseValue()

        return JsonKeyValue(key.literal as String, value)
    }

    private fun parseValue(): JsonElement {
        if (match(TokenType.NULL))
            return JsonValue(null)

        if (match(TokenType.TRUE))
            return JsonValue(true)

        if (match(TokenType.FALSE))
            return JsonValue(false)

        if (match(TokenType.MINUS)) {
            val numberToken = consume(TokenType.NUMBER, "Expect a number after -")
            val number = (numberToken.lexeme.toDoubleOrNull() ?: throw KJsonParserError("What the hell!?")) * -1.0

            return JsonValue(number)
        }

        if (match(TokenType.NUMBER, TokenType.STRING))
            return JsonValue(previous().literal)

        if (check(TokenType.LEFT_SQUARE) || check(TokenType.LEFT_BRACKET))
            return parseJson()

        throw KJsonParserError(errorStr("Expect 'null', 'true', 'false', number or string, but got something else"))
    }

    fun parse(tokens: List<Token>): JsonElement {
        current = 0
        this.tokens = tokens

        return parseJson()
    }
}