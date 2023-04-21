package section1ProgrammingBasics.varAndVal.exercises

/*
Define a `val answer` and set its value to `42`.
Display the value of `answer` on the console.

On the next line, try to reassign `answer` to `43`.
What error does Kotlin produce? Fix the error by replacing `val` with `var`.
Display the new value of `answer` on the console.

*/

fun main() {
    //val answer = 42
    //println(answer)
    //answer = 43 // Error: Val cannot be reassigned

    var answer = 42
    println(answer)
    answer = 43
    println(answer)
}

/* Output:
42
43
*/