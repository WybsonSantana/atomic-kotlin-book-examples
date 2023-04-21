package section1ProgrammingBasics.dataTypes.exercises

/*
In the accompanying example, all the type declarations from Types.kt are
removed. Verify that Kotlin successfully infers the types.

If you put the caret on an identifier and press
&shortcut:QuickJavaDoc;, you'll check the type
Kotlin infers for this identifier.

Press &shortcut:EditorEscape; to close the pop-up.

Check the types of all declared variables in the example
*/

fun main() {
    val whole = 11
    val fractional = 1.4
    val trueOrFalse = true
    val words = "A value"
    val character = 'z'
    val lines = """Triple quotes let
        you have many lines
        in your string"""

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(character)
    println(lines)
}

/* Output:
11
1.4
true
A value
z
Triple quotes let
        you have many lines
        in your string
*/