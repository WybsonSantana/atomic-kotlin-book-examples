package section1ProgrammingBasics.varAndVal.exercises

/*
Define `var a = 10`. Now define a `val b = a`. Now assign `42` to `a` and
display both `a` and `b` on different lines.
*/

fun main() {
    var a = 10
    val b = a
    a = 42
    println(a)
    println(b)
}

/* Output:
42
10
*/