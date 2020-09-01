fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0): Int = a + b + c

fun main() {
    println("First ${foo()}, second ${foo()}")

    val languages = mutableListOf<String>("Java", "Kotlin")
    /*println(languages[0] + " " + languages[1])
    println("Result from a bigger number: ${max(4, 2334)}")

    println(
        listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"
        )
    )

    println(listOf('a', 'b', 'c').joinToString(postfix = "."))

    println(displaySeparator())
    sum(1)*/

    val exLoop = LoopsExamples()
    exLoop.mapLopExample()
    exLoop.rangeLoop()


}