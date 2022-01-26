import com.algorithms.binarySearch

fun main(args: Array<String>) {
    val sortedArr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = binarySearch(sortedArr, 4)

    println(result)
}