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

fun String.get(index: Int) = '*'

@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0): Int = a + b + c

fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'

fun Char.isLetterOrDigit() = isLetter() || this in '0'..'9'

infix fun <T> T.eq(other: T) {
    if (this == other) println("Ok")
    else println("Error: $this != $other")
}


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
    //exLoop.exampleInARange('p')
    //exLoop.isValidIdentifier("a")

    /*println(exLoop.isValidIdentifier("name"))   // true
    println(exLoop.isValidIdentifier("_name")) // true
    println(exLoop.isValidIdentifier("_12"))    // true
    println(exLoop.isValidIdentifier(""))       // false
    println(exLoop.isValidIdentifier("012"))    // false
    println(exLoop.isValidIdentifier("no$"))    // false*/

    // Call Extensions
    /*println('a'.isLetter())
    println('a'.isLetterOrDigit())

    val q = """To code,
        |or not to code?...""".trimMargin("|")

    val a = """
        Keep calm
        and learn Kotlin""".trimIndent()

    println(q)
    println(a)

    println("abc".get(1))*/
    val exNull = NullabilityEx();
    print(exNull.exampleString())

    val alice = Person("Alice", 39)
    val agePredicate: (Int) -> Boolean = {ageLimit -> alice.isOlder(ageLimit)}

    agePredicate(32)
}

class Person(val name: String, val age: Int){
    fun isOlder(ageLimit: Int) = age > ageLimit
}