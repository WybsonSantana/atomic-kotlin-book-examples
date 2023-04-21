package section1ProgrammingBasics.functions.exercises

/*
Create a function `duplicate()` that takes a `String` parameter
and returns that `String` repeated twice.
*/

fun duplicate(string: String) = string + string

fun main() {
    println(duplicate("Kotlin "))
}

/* Output
Kotlin Kotlin
*/