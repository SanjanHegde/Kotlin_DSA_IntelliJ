// Given a Max value and a increment value, print the values of positive integers in an array.

fun NumSeries(max : Int, increment : Int): ArrayList<Int> {
    val array = ArrayList<Int>()
    var incrementor = increment
    while(max >= incrementor){
        array.add(incrementor)
        incrementor += increment
    }
    return array
}

fun main() {
    val max = (1..100).random()
    val increment = (3..5).random()
    val nums = NumSeries(max, increment)
    println("With max value of $max and incrementing with $increment the array is: $nums")
    // Output: With max value of 29 and incrementing with 3 the array is: [3, 6, 9, 12, 15, 18, 21, 24, 27]
}