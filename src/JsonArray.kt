class JsonArray(
    private val values: Array<JsonElement>
) : JsonElement() {
    override fun findKey(key: String): JsonElement? {
        for (value in values)
            if (value !is JsonValue)
                return value.findKey(key) ?: continue

        return null
    }

    override fun filterKeys(filter: (key: String) -> Boolean): Array<JsonElement> {
        val filtered = mutableListOf<JsonElement>()

        for (value in values) {
            if (value !is JsonValue)
                filtered.addAll(value.filterKeys(filter))
        }

        return filtered.toTypedArray()
    }

    override fun toString(): String {
        val sb = StringBuilder()

        sb.append("[")

        for ((index, jsonElement) in values.withIndex()) {
            sb.append(jsonElement)

            if (index + 1 < values.size)
                sb.append(", ")
        }

        sb.append("]")

        return sb.toString()
    }

    fun size() = values.size

    operator fun get(index: Int) = values[index]

    operator fun set(index: Int, value: JsonElement) {
        values[index] = value
    }
}