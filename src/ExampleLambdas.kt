inline fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Alphabet");
    return stringBuilder.toString()
}

fun main() {

    val sb = StringBuilder()
    with(sb) {
        this.appendLine("Alphabet")
        for (c in 'a'..'z') {
            this.append(c)
        }
        toString()
    }

    val s: String = buildString()
    println(s)

}
