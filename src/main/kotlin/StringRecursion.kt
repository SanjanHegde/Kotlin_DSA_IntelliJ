/**
 * Print Reverse of a string without using any extension functions or loops
 * Solution: Use Recursion
 * Author: Sanjan Hegde
 **/

fun reverseString(string: String): String {
    return if (string.isEmpty()) string
    else reverseString(string.substring(1)) + string[0]
}

fun main() {
    val sentence = "Sanjan Hegde"
    val reversed = reverseString(sentence)
    println("The reversed sentence is: $reversed") // Output: edgeH najnaS
}