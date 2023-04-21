package section1ProgrammingBasics.dataTypes.exercises

/*
Guess the results of the following expressions and then check your guesses
using Kotlin:

```kotlin
val c1 = 'a' + 1
val c2 = 'a' + 25
val c3 = 'E' - 2
```

You can open the hint within IntelliJ IDEA to understand the results.

Characters are stored as numbers corresponding to their
unicode values, so adding an integer to
a character produces a new character corresponding to the new code value.

Unicode - Wikipedia: https://en.wikipedia.org/wiki/Unicode
*/

fun main() {
    'a' + 1
    println('a' + 1)

    // 'a' + 25
    println('a' + 25)

    // 'e' - 2
    println('e' - 2)
}

/* Output:
b
z
c
*/