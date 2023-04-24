package section1ProgrammingBasics.stringTemplates.exercises

/*
The IDE simplifies many common actions. For example, suppose you want to rename
an identifier. Inventing a good name is difficult, so it's often an iterative
process. After using a function, for example, you might think up a better name
for it.

Find and Replace may
lead to unexpected results, because the name might appear in different
contexts, for example inside strings or comments. In the code example you can
see answer both as a name for a val and as a part of a string literal. It's
even more complicated when renaming a function because that function might be
used in many files.

The IDE allows you to rename a declaration automatically. Put the caret on the
val name and press &shortcut:RenameElement;.
You can also choose Refactor from the
application menu, then choose Rename.

Rename the val name to result without changing the word "answer" in the
string literal. The string should become: "The answer is $result".
*/

fun main() {
    val answer = 42
    println("The answer is $answer")
}

/* Output:
The answer is 42
*/