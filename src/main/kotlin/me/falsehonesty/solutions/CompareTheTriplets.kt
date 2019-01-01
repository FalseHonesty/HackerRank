package me.falsehonesty.solutions

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val output = mutableListOf(0, 0)

    for (i in 0 until a.size) {
        when {
            a[i] > b[i] -> output[0]++
            a[i] < b[i] -> output[1]++
        }
    }

    return output.toTypedArray()
}
