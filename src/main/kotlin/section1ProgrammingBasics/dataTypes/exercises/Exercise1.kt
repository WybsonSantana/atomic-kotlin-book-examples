package section1ProgrammingBasics.dataTypes.exercises

/*
Declare a `var` called `answer` of type `Int` and set its value to `42`. In the
next line try to reassign `answer` to the `String` "unknown". What error does
Kotlin produce?

Remove the `Int` type specification. Does the error change?

Display the first line of the error produced by Kotlin.

*/

fun main() {
    var answer = 42
    //answer = "Unknown"  // Error: Type mismatch: inferred type is String but Int was expected
    println("Type mismatch: inferred type is String but Int was expected")
}

/* Ouput:
Type mismatch: inferred type is String but Int was expected
*/