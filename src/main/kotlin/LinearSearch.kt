/**
 * Linear Search
 * Given an array, search for a value and print its index if it is present.
 *
 * Author: Sanjan Hegde
 */

fun <T> searchTheArray(array: Array<T>, search: T): Int {
    for(i in array.indices){
        if(array[i] == search){
            return i
        }
    }
    return -1
}

fun main(){
    val arrayToSearch = arrayOf(9, 12, 5, 8, 92, 102)
    val searchItem = 99
    println("Values in the array is : ${arrayToSearch.joinToString(", ")}")
    val index = searchTheArray(arrayToSearch, searchItem)
    if(index >= 0){
        print("Value found in the array at the index: $index")
    }
    else{
        print("Searched value is not present in the array.")
    }
    /*
    * Output:
    * Values in the array is : 9, 12, 5, 8, 92, 102
    * Searched value is not present in the array.
    */

}