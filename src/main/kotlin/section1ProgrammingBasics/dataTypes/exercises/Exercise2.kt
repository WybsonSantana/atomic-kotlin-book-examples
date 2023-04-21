package section1ProgrammingBasics.dataTypes.exercises

/*
Attempt to combine various `val`s of different types using the `+` operator.
Only combine two at a time, and assign each combination to a `val` result. See
which types combine. On the console, display the name of the type that can be
combined with any other type if it goes first.
*/

fun main() {
    val string: String = "Atomic Kotlin"
    val int: Int = 17
    val double: Double = 1.8
    val boolean: Boolean = true
    val char: Char = 'K'

    // Can be combined:
    // String can be combined with every other type:

    val si: String = string + int
    val sd: String = string + double
    val sb: String = string + boolean
    val sc: String = string + char

    val d1: Double = int + double
    val d2: Double = double + int
    val s1: String = char + string
    val c1: Char = char + int

    println("The type that can be combined with every other types using '+': String")

    // Can't be combined:
    //val bb = boolean + boolean
    //val ic = int + char
    //val ds = double + string

    println(si)
    println(sd)
    println(sb)
    println(sc)

    println(d1)
    println(d2)
    println(s1)
    println(c1)
}

/* Output:
The type that can be combined with every other types using '+': String
Atomic Kotlin17
Atomic Kotlin1.8
Atomic Kotlintrue
Atomic KotlinK
18.8
18.8
KAtomic Kotlin
\
*/