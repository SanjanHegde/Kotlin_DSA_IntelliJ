import java.util.*

/**
 * Given a number N, write a function that generates and prints all binary numbers with decimal values from 1 to N using queue DS.
 */

fun generatePrintBinary(n: Int) {
    val q: Queue<String> = LinkedList()
    // Enqueue the first binary number
    q.add("1")
    // This loops is like BFS of a tree with 1 as root 0 as left child and 1 as right child and so on
    var count = n
    while (count-- > 0) {
        // print the front of the queue
        val s1 = q.peek()
        q.remove()
        println(s1)
        // Store s1 before changing it
        val s2 = s1
        // Append "0" to s1 and enqueue it
        q.add(s1 + "0")
        // Append "1" to s2 and enqueue it. Note that s2
        // contains the previous front
        q.add(s2 + "1")
    }
}

fun main(){
    val n = 10
    generatePrintBinary(n)
}