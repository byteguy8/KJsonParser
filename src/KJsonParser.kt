class KJsonParser {
    private val scanner = Scanner()
    private val parser = Parser()

    /**
     * Parse the input string
     * @param input The string containing the json
     * @return A JsonElement object representing
     * the parsed json
     * @throws KJsonParserError If some error related to
     * the process occurs
     */
    fun parse(input: String): JsonElement {
        val tokens = scanner.scan(input)
        return parser.parse(tokens)
    }
}