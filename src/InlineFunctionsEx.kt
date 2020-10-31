import java.util.concurrent.locks.Lock

fun getEmail(): Email? {
    return Email("rastas@gmail.com", "")
}

fun sendEmail(e: Email) {
    print("Sending email to ${e.user} and ${e.email}")
}

fun myRun(f: () -> Unit) = f()

inline fun <R> run(block: () -> R): R = block()

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    synchronized(lock) {
        println("Action")
    }
}

inline fun <T> Lock.withLock(action: () -> T): T {
    lock()
    try {
        return action()
    }finally {
        unlock()
    }
}


fun main() {
    val email = getEmail()
    email?.let { e -> sendEmail(e) }


    // takeIf most so satisfy the expression and get the resulting value for that
    val number = 42
    print(number.takeIf { it > 10 })

    val name = "Ramiro"
    name.takeUnless(String?::isNullOrEmpty)


    // repeat function
    repeat(10) {
        println("Hey jude!")
    }


    // Todo Inline Function: compiler substitutes a body of the function instead of caling it

    val name2 = "Kotlin"
    // Overheads create an anonymous class and object from lambda function under the hood
    myRun { println("hi, $name!") }

    run { println("Hi, $name2") }


}

class Email(email: String, user: String) {

    val user: String = user
    val email: String = email

}
