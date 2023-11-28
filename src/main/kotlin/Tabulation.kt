// Tabulation
// Finding the minimum number of coins needed to make a given amount of money

fun minCoins(coins: IntArray, m: Int, V: Int): Int {
    // table[i] will be storing the minimum
    // number of coins required for i value.
    val table = IntArray(V + 1)

    // Initialize all table values as Infinite
    for (i in 0..V) table[i] = Int.MAX_VALUE

    // Base case (If given value V is 0)
    table[0] = 0

    // Iterate through all coins and update
    // table values after the index greater
    // than or equal to the value of the
    // picked coin
    for (i in 0 until m) {
        for (j in coins[i]..V) {
            if (table[j - coins[i]] != Int.MAX_VALUE)
                table[j] = table[j].coerceAtMost(table[j - coins[i]] + 1)
                //  table[j] = Math.min(table[j], table[j - coins[i]] + 1)
        }
    }
    return if (table[V] != Int.MAX_VALUE) table[V] else -1
}

fun main() {
    val coins = intArrayOf(9, 6, 5, 1)
    val m = coins.size
    val V = 1011
    println("Minimum coins required is " + minCoins(coins, m, V))
    // Output: "Minimum coins required is 113"
}