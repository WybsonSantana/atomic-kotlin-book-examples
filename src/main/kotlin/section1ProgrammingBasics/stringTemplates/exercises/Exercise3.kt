package section1ProgrammingBasics.stringTemplates.exercises

/*
Write a function `show()` with parameters `i: Int`, `s: String`, `c: Char` and
`d: Double`. On the console, `show()` displays the value of each parameter on
its own line: first the name of the identifier, then a colon and a space, and
then the value of that identifier. Surround the `String` value with double quotes
and the `Char` value with single quotes.

Sample output:

```text
i: 10
s: "abc"
c: 'a'
d: 1.0
```
*/

fun show(i: Int, s: String, c: Char, d: Double): String =
    "i: $i\ns: \"$s\"\nc: \'$c\'\nd: $d"

fun main() {
    println(show(10, "abc", 'a', 1.0))
}

/* Output:
i: 10
s: "abc"
c: 'a'
d: 1.0
*/