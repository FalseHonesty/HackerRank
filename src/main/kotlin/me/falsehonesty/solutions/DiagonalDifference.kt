package me.falsehonesty.solutions

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val primary = (0..arr.lastIndex).map { arr[it][it] }.sum()
    val secondary = (arr.lastIndex downTo 0).map { arr[arr.lastIndex - it][it] }.sum()

    return abs(primary - secondary)
}
