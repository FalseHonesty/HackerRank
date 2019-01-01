package me.falsehonesty.solutions

fun nonDivisibleSubset(k: Int, S: Array<Int>): Int {
    val arr = IntArray(k)

    S.forEach {
        arr[it % k]++
    }

    if (k % 2 == 0) {
        arr[k / 2] = Math.min(arr[k / 2], 1)
    }

    var res = Math.min(arr[0], 1)

    for (i in 1..k/2) {
        res += Math.max(arr[i], arr[k-i])
    }

    return res
}
