class MemoizationExample {
    fun fibonacci(n: Int): Long {
        if (n <= 1) {
            return n.toLong()
        }
        if (memoizedFib.containsKey(n)) {
            return memoizedFib[n]!!
        }
        val result = fibonacci(n - 1) + fibonacci(n - 2)
        memoizedFib[n] = result
        return result
    }
    companion object {
        // HashMap to store previously calculated results for memoization (cache).
        var memoizedFib = HashMap<Int, Long>()
    }

}

fun main() {
    val memo = MemoizationExample()
    println(memo.fibonacci(10)) // This will calculate the Fibonacci number for 10 and cache the result
    println(memo.fibonacci(10)) // This will retrieve the cached result for Fibonacci number 10
}