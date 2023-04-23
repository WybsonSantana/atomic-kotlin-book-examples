package section1ProgrammingBasics.ifExpressions.exercises

/*
Create a function `abs()` that returns the absolute value of its parameter:
for example, `abs(3)` is `3` and `abs(-5)` is `5`.
*/

fun abs(number: Int): Int =
    if (number >= 0) number else -number

fun main() {
    println(abs(3))
    println(abs(-5))
}

/* Output:
3
5
*/