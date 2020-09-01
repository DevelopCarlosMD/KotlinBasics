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
            print(ch + 1)
        }
    }


}