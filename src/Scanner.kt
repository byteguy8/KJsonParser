class Scanner {
    private var line = 1
    private var start = 0
    private var current = 0
    private var source = ""
    private var tokens = mutableListOf<Token>()

    private fun errorMessage(message: String): String {
        if (current >= source.length)
            return "Parsing error at end: $message"

        return "Parsing error at line $line (Related token '${source[current]}'): $message"
    }

    private fun isAtEnd() = current >= source.length

    private fun isDigit(c: Char) = c >= '0' && c <= '9'

    private fun isAlpha(c: Char) = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')

    private fun advance(): Char {
        if (isAtEnd())
            return '\u0000'

        return source[current++]
    }

    private fun peek(): Char {
        if (isAtEnd())
            return '\u0000'

        return source[current]
    }

    private fun addToken(literal: Any?, type: TokenType) {
        val lexeme = source.substring(start, current)
        val token = Token(line, lexeme, literal, type)

        tokens.add(token)
    }

    private fun addToken(type: TokenType) {
        addToken(null, type)
    }

    private fun number() {
        while (!isAtEnd() && isDigit(peek()))
            advance()

        if (peek() == '.') {
            advance()

            while (isDigit(peek()))
                advance()
        }

        val rawLiteral = source.substring(start, current)
        val literal = rawLiteral.toDoubleOrNull() ?: throw KJsonParserError("What the hell!?")

        addToken(literal, TokenType.NUMBER)
    }

    private fun string() {
        var lines = 0

        while (!isAtEnd() && peek() != '"') {
            if (advance() == '\n')
                lines++;
        }

        if (peek() != '"')
            throw KJsonParserError(errorMessage("Unterminated string"))

        advance()

        val literal = source.substring(start + 1, current - 1)
        addToken(literal, TokenType.STRING)

        line += lines
    }

    private fun keyword() {
        while (!isAtEnd() && isAlpha(peek()))
            advance()

        when (source.substring(start, current)) {
            "null" -> addToken(TokenType.NULL)
            "true" -> addToken(TokenType.TRUE)
            "false" -> addToken(TokenType.FALSE)
            else -> throw KJsonParserError(errorMessage("Expect 'null', 'true' or 'false', but got something else"))
        }
    }

    private fun scanToken() {
        when (val c = advance()) {
            '-' -> addToken(TokenType.MINUS)
            ',' -> addToken(TokenType.COMMA)
            ':' -> addToken(TokenType.COLON)
            '{' -> addToken(TokenType.LEFT_BRACKET)
            '}' -> addToken(TokenType.RIGHT_BRACKET)
            '[' -> addToken(TokenType.LEFT_SQUARE)
            ']' -> addToken(TokenType.RIGHT_SQUARE)
            ' ' -> {}
            '\t' -> {}
            '\n' -> line++
            else -> {
                if (isDigit(c))
                    number()
                else if (c == '"')
                    string()
                else if (isAlpha(c))
                    keyword()
                else
                    throw KJsonParserError(errorMessage("Unknown token"))
            }
        }
    }

    fun scan(input: String): List<Token> {
        if (tokens.isNotEmpty())
            tokens.clear()

        line = 1
        start = 0
        current = 0
        source = input

        while (!isAtEnd()) {
            scanToken()
            start = current
        }

        addToken(TokenType.EOF)

        return tokens
    }
}