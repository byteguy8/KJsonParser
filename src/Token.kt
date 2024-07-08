data class Token(
    val line: Int,
    val lexeme: String,
    val literal: Any?,
    val type: TokenType
)
