package section1ProgrammingBasics.stringTemplates.examples

fun main() {
    val condition = true
    println("${if (condition) 'a' else 'b'}")

    val x = 11
    println("$x + 4 = ${x + 4}")
}

/* Output:
a
11 + 4 = 15
*/