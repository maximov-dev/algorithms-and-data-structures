package com.algorithms

fun binarySearch(list: Array<Int>, item: Int): Int? {
    var low = 0
    var high = list.size

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = list[mid]

        if (guess == item) {
            return mid
        }

        if (guess > item) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return null
}