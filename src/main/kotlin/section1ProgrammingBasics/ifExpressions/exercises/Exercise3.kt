package section1ProgrammingBasics.ifExpressions.exercises

/*

Create a function `findMax()` that finds the maximum value when given two
integer arguments.
*/

fun findMax(num1: Int, num2: Int): Int =
    if (num1 > num2) num1 else num2

fun main() {
    println(findMax(11, 17))
    println(findMax(11, 8))
}

/* Output:
17
11
*/