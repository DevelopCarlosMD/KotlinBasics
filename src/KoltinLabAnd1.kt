private fun String?.printBirthdayMessage() {
    println("=================================")
    println("Happy Birthday, $this!")
    println("=================================")
}

fun repeatChar(border: String, times: Int) {
    repeat(times) {
        print(border)
    }
    println("")
}


fun main() {

    val name = "JC"


    //println("Happy Birhtday, $name!")
    name.printBirthdayMessage()

    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println(repeatChar("@", 11))
    println("{~@~@~@~@~}")
    println(repeatChar("@", 11))

    // This prints an empty line.
    println("")

    val age = 32

    val borer1 = "`-._,-'"

    println("You are already $age!")
    println("$age is the very best age to celebrate!")

    val daysLiving = age * 365

    println("You are already $daysLiving days living!")
    println("$daysLiving days old is the very best age to celebrate!")
}


