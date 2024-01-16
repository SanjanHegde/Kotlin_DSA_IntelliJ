// Find the total number of even and odd numbers in an array

fun countEvenOdd(arr: IntArray) {
    var evenCount = 0
    var oddCount = 0
    for (element in arr) {
        if (element and 1 == 1) oddCount++ else evenCount++
    }
    println(
        "Number of even elements = $evenCount \nNumber of odd elements = $oddCount"
    )
}

fun main() {
    val arr = intArrayOf(12, 33, 94, 5, 56)
    countEvenOdd(arr)
}

// Output
// Number of even elements = 3
// Number of odd elements = 2
