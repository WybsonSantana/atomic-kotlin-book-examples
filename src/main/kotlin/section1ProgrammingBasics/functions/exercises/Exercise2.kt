package section1ProgrammingBasics.functions.exercises

/*
Create a function `sumDoubles()` that takes three `Double` parameters
and returns their sum.
*/

fun sumDoubles(num1: Double, num2: Double, num3: Double) = num1 + num2 + num3

fun main() {
    println(sumDoubles(1.8, 2.2, 3.0))
}

/* Output:
7.0
*/