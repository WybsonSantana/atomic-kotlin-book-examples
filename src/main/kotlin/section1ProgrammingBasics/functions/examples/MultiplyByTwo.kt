package section1ProgrammingBasics.functions.examples

fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo()...")
    return x * 2
}

fun main() {
    val result = multiplyByTwo(5)
    println(result)
}

/*
Inside multiplyByTwo()...
10
*/