package me.falsehonesty.solutions

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val ranks = IntArray(alice.size)
    val distinct = scores.distinct()

    for (i in 0 until alice.size) {
        val insertionPoint = binarySearchDescending(distinct, alice[i])

        ranks[i] = insertionPoint + 1
    }

    return ranks.toTypedArray()
}

fun binarySearchDescending(list: List<Int>, target: Int): Int {
    var low = 0
    var high = list.lastIndex

    while (low <= high) {
        val mid = (low + high) ushr 1
        val midVal = list[mid]

        when {
            midVal > target -> low = mid + 1
            midVal < target -> high = mid - 1
            else -> return mid
        }
    }

    return low
}
