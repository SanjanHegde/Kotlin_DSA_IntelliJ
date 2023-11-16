//Compare the number groupings and print the largest single digit odd number.
//If there is no odd number present in the given string then return -1
//Input: gt12cty65mt1
//Output: 5

fun returnHighestOdd(s: String): Int {
    var highest = Int.MIN_VALUE
    for (char in s) {
        if (char.isDigit()) {
            val current = char.digitToInt()
            if (current % 2 != 0 && highest < current) {
                highest = current
            }
        }
    }
    return if(highest == Int.MIN_VALUE) -1 else highest
}

fun main() {
    val arr = arrayOf("par1c9Gy65mt19r", "ar1452ctwq4y65mt1","gt12c32ty67mt1")
    for(string in arr){
        println(returnHighestOdd(string))
    }
}
// Output
// 9
// 5
// 7