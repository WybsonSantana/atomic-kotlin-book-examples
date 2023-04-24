package section1ProgrammingBasics.stringTemplates.exercises

/*
Implement a `record()` function that returns a `String` in the form: `index
[status] message`, where each item is passed into `record()` as a parameter.
`record()` should add a line break (`\n`) at the end of the `String`.
*/

fun record(index: Int, status: String, message: String): String =
    "$index [$status] $message\n"

fun main() {
    print(record(200, "Ok", "Request made successfully!"))
    print(record(404, "Not found", "Element not found!"))
}

/* Output:
200 [Ok] Request made successfully!
404 [Not found] Element not found!
*/