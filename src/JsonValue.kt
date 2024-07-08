class JsonValue(
    val value: Any?
) : JsonElement() {
    override fun findKey(key: String): JsonElement? {
        // too lazy to do something
        return null
    }

    override fun filterKeys(filter: (key: String) -> Boolean): Array<JsonElement> {
        // too lazy to do something
        return emptyArray()
    }

    override fun toString(): String {
        return "$value"
    }
}