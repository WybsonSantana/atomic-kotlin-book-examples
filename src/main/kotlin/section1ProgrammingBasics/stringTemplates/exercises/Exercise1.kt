package section1ProgrammingBasics.stringTemplates.exercises

/*
Display the result of the function `findMax()` (from the exercises in the
previous atom) on the console in the form "The maximum of x and y is max." Use
a `String` template to perform the substitution of  `x`, `y` and the maximum
value.
*/

fun findMax(num1: Int, num2: Int): Int =
    if (num1 > num2) num1 else num2

fun main() {
    val num1 = 11
    val num2 = 17

    println("The maximum of $num1 and $num2 is ${findMax(num1, num2)}.")
}

/*
The maximum of 11 and 17 is 17.
*/