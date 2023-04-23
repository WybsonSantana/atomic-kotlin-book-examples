package section1ProgrammingBasics.ifExpressions.exercises

/*
To navigate to a function definition, put the caret on the usage and press
&shortcut:GotoDeclaration;. Alternatively, you
can click on the symbol while holding the Ctrl key (or the Command key on Mac).

Put the caret on the oneOrTheOther() function call in main() and navigate
to the function definition
*/

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True!"
    else
        "False!"

fun main() {
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x == 2))
}

/* Output:
True!
False!
*/