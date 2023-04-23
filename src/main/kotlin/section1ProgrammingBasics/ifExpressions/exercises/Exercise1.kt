package section1ProgrammingBasics.ifExpressions.exercises

/*
Create a function `checkSign()` that checks whether an integer number is
positive, negative, or zero, and returns a `String` "positive", "negative" or
"zero" as a result.
*/

fun checkSign(number: Int): String =
    if (number > 0)
        "The number is positive!"
    else if (number < 0)
        "The number is negative!"
    else
        "The number is zero!"

fun main() {
    println(checkSign(17))
    println(checkSign(-11))
    println(checkSign(0))
}

/* Output:
The number is positive!
The number is negative!
The number is zero!
*/