class LoopsExamples {

    fun mapLopExample() {
        val map = mapOf(
            1 to "one",
            2 to "two",
            3 to "threee"
        )

        for ((key, value) in map) {
            println("$key = $value")
        }
    }

    fun rangeLoop() {

        // Example using in
        for (i in 1..9)
            println(i)

        // Example using until is like < on java 12345678
        for (i in 1 until 9)
            println(i)

        // from high to less
        for (i in 9 downTo 1 step 1)
            println(i)

        // the next character!!
        for (ch in "abc") {
            println(ch + 1)
        }
    }

    fun exampleInARange(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know... can you repeat that question! xD"
    }

    fun isValidIdentifier(s: String): Boolean {
        return when (s) {
            in "_12".."_19" -> true
            in "_name".."name" -> true
            else -> false
        }
    }




}

