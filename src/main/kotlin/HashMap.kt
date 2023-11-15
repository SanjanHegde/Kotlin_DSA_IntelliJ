/**
 * Sample Input
 * ("3", "sam 99912222", "tom 11122222", "harry 12299933", "sam", "Addie", "harry")
 * Sample Output
 * 99912222
 * Not found
 * 12299933
 */

fun hashMapSample(args: Array<String>) {
    val mapSize = args[0].toInt()
    var myHashMap = HashMap<String, String>()
    for (i in 1..mapSize) {
        val stringSplits = args[i].split(" ").toTypedArray()
        myHashMap[stringSplits[0]] = stringSplits[1]
    }
    for (i in mapSize + 1 until args.size) {
        if (myHashMap.containsKey(args[i])) {
            println("${myHashMap[args[i]]}")
        } else {
            println("Not found")
        }
    }
}

fun main() {
    val array = arrayOf("3", "sam 99912222", "tom 11122222", "harry 12299933", "sam", "Addie", "harry")
    hashMapSample(array)
}