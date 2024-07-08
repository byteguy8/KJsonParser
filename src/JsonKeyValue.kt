class JsonKeyValue(
    private val key: String,
    private val value: JsonElement
) : JsonElement() {
    override fun findKey(key: String): JsonElement? {
        if (key == this.key)
            return value

        if (value !is JsonValue)
            return value.findKey(key)

        return null
    }

    override fun filterKeys(filter: (key: String) -> Boolean): Array<JsonElement> {
        val filtered = mutableListOf<JsonElement>()

        if (filter(key)) {
            filtered.add(value)

            if (value !is JsonValue)
                filtered.addAll(value.filterKeys(filter))
        }

        return filtered.toTypedArray()
    }

    override fun toString(): String {
        return "key: $key, value: $value"
    }
}