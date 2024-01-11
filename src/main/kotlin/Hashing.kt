// Given an array of integers,find out whether there are any two numbers in the array whose sum equals a given target value.

fun hasPairWithSum(arr: IntArray, target: Int): Boolean {
    val numSet = HashSet<Int>()
    for (num in arr) {
        if (numSet.contains(target - num)) {
            return true
        }
        numSet.add(num)
    }
    return false
}

fun main() {
    val arr = intArrayOf(0, 9, 5, 7, 4)
    val target = 9
    val result = hasPairWithSum(arr, target)
    println("Does the array: ${arr.contentToString()} ,contain a pair of numbers that sum to $target? \n$result")
}
// Output:
// Does the array: [0, 9, 5, 7, 4] ,contain a pair of numbers that sum to 9?
//true