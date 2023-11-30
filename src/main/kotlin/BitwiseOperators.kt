// Add 2 numbers without using arithemetic operations
fun addNumbers(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b
    var sum: Int
    var carry: Int

    do {
        // XOR calculates the sum
        sum = num1 xor num2

        // AND calculates the carry
        carry = (num1 and num2) shl 1

        // Update num1 and num2 for the next iteration
        num1 = sum
        num2 = carry
    } while (num2 != 0)

    return sum
}

fun main() {
    val num1 = 5
    val num2 = 7
    val result = addNumbers(num1, num2)

    println("Sum of $num1 and $num2 is: $result")
}