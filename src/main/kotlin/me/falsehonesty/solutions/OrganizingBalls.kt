package me.falsehonesty.solutions

fun organizingContainers(container: Array<Array<Int>>): String {
    val n = container.size

    val slots = container.map {
        var sum = 0L
        for (i in it) sum += i
        sum
    }

    for (i in 0 until n) {
        var sum = 0L
        for (it in container) sum += it[i]

        if (sum > slots[i]) return "Impossible"
    }

    return "Possible"
}
