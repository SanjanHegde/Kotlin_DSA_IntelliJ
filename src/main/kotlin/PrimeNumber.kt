/**
 * Generate a random number and check if it is prime or composite.
 *
 */

fun checkIfPrime(s: Int): String {
    when {
        s < 2 -> return "Composite"
        s == 2 -> return "Prime"
        else -> {
            for (num in 2..s / 2) {
                if (s % num == 0) return "Composite"
            }
        }
//        AI solution below
//        s % 2 == 0 -> return "Composite"
//        else -> {
//            for (num in 3..sqrt(s.toDouble()).toInt() step 2) {
//                if (s % num == 0) return "Composite"
//            }
//        }

    }
    return "Prime"
}

fun main() {
    val input = (-1000..30000).random()
    print("The number $input is ${checkIfPrime(input)}") // Output : "The number -628 is Composite"
}