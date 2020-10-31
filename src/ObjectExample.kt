import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

// In kotlin an object is a singleton just generate one reference

object KSingleton {
    fun foo() {
        println("I am an object singleton!")
    }

    fun rastaMsg() {
        println("I dont need to declare a variable dude")
    }
}

fun main() {
    KSingleton.foo()
    KSingleton.rastaMsg()

    ExA.foo()
}

// Object Expression replace anonymous classes
// Is an object expression a singleton? false
/*window.addMouseListener(
object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
        // ...
    }
    override fun mouseEntered(e: MouseEvent) {
        // ...
    }
})*/

// Companion Objects

class ExA {
 companion object {
     fun foo() = 1
 }
}
