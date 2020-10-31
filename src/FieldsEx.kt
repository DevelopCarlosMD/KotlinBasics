class StateLogger {
    private var boolState = false

    var counter: Int = 0
        private set

    var stateEnum: State
        get() = if (boolState) State.ON else State.OFF
        set(value: State) {
            boolState = value == State.ON
        }

    var state = false
        set(value) {
            println("state has changed: $field -> $value")

            field = value
        }
}

val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..lastIndex

val String.medianChar
    get() : Char? {
        println("Calculating...")
        return getOrNull(length / 2)
    }

enum class State { ON, OFF }

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

// Cant be  primitive type
class InitTest {
    lateinit var lateInitVar: String

    fun initializationLogic() {
        println(this::lateInitVar.isInitialized)
        lateInitVar = "value"
        println(this::lateInitVar.isInitialized)
    }

}


fun main() {

    var state = StateLogger()
    state.state = true

    println(state.counter)

    // Extension Properties
    println("tapa rabos dude".indices)

    println("tapa rabos dude".lastIndex)

    val s = "abs"
    println(s.medianChar)
    println(s.medianChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    println(lazyValue)


    var iniTest = InitTest()
    iniTest.initializationLogic()


}