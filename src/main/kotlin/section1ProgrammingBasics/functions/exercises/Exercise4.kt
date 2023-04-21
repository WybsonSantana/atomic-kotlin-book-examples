package section1ProgrammingBasics.functions.exercises

/*
You can automatically convert a function with a block body to a function with
an expression body, and vice versa. Put the caret somewhere on the return
keyword, press &shortcut:ShowIntentionActions;
to call the intention actions menu, and choose
Convert to expression body.
After the conversion the type remains highlighted, which is
convenient because you can either remove the type declaration by pressing
Delete or leave it by moving the caret to the right.

To apply the reverse intention, press
&shortcut:ShowIntentionActions;
on the equal sign on the function with expression body and choose the
reverse conversion.

Apply Convert to expression body, and then
Convert to block body intention actions.
*/

fun foo(): String {
    return "Kotlin"
}

fun main() {
    println(foo())
}

/* Output:
Kotlin
*/