package section1ProgrammingBasics.ifExpressions.examples

fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "It's true!"
    return "It's false!"
}

fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))
}

/* Output:
It's true!
It's false!
*/