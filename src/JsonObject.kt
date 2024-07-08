class JsonObject(
    private val values: Array<JsonKeyValue>
) : JsonElement() {
    override fun findKey(key: String): JsonElement? {
        for (value in values)
            return value.findKey(key) ?: continue

        return null
    }

    override fun filterKeys(filter: (key: String) -> Boolean): Array<JsonElement> {
        val filtered = mutableListOf<JsonElement>()

        for (value in values)
            filtered.addAll(value.filterKeys(filter))

        return filtered.toTypedArray()
    }

    override fun toString(): String {
        val sb = StringBuilder()

        for (value in values)
            sb.append("$value\n")

        return sb.toString()
    }

    fun size() = values.size

    operator fun get(index: Int) = values[index]

    operator fun set(index: Int, value: JsonKeyValue) {
        values[index] = value
    }
}