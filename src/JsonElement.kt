abstract class JsonElement {
    abstract fun findKey(key: String): JsonElement?

    abstract fun filterKeys(filter: (key: String) -> Boolean): Array<JsonElement>
}