import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException(
        "Unknown expression"
    )
}

// Sealed modifier restricts class hierarchy
sealed class Expr2
class Num2(val value: Int) : Expr2()
class Sum2(val left: Expr2, val right: Expr2) : Expr2()

fun eval2(e: Expr2): Int = when (e) {
    is Num2 -> e.value
    is Sum2 -> eval2(e.left) + eval2(e.right)
}

// Class Delegation Kotlin using by
class Customer {

}

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(
    repository: Repository,
    logger: Logger
) : Repository by repository, Logger by logger

fun use(controller: Controller) {
    controller.logAll()
}