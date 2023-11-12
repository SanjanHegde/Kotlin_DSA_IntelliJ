/**
 * A pangram is a string that contains every letter of the alphabet.
 * "The quick brown fox jumps over a lazy dog." is a pangram
 * "The fluffy cat enjoys chasing butterflies in the garden." is not a pangram as it is missing Z.
 */
fun checkIfPangram(s: String): Boolean {
    val alphabetSet = mutableSetOf<Char>()
    for (char in s.lowercase()) {
        if (char.isLetter()) {
            alphabetSet.add(char)
        }
    }
    return alphabetSet.size == 26
}


fun main() {
    val firstSentence = "The quick brown fox jumps over a lazy dog."
    val secondSentence = "The fluffy cat enjoys chasing butterflies in the garden."
    val thirdSentence = "Sphinx of black quartz, judge my vow."

    println("\"$firstSentence\" is a pangram: ${checkIfPangram(firstSentence)}") // Output: "The quick brown fox jumps over a lazy dog." is a pangram: true
    println("\"$secondSentence\" is a pangram: ${checkIfPangram(secondSentence)}") // "The fluffy cat enjoys chasing butterflies in the garden." is a pangram: false
    print("\"$thirdSentence\" is a pangram: ${checkIfPangram(thirdSentence)}") // "Sphinx of black quartz, judge my vow." is a pangram: true
}