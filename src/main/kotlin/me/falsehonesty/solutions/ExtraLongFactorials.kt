package me.falsehonesty.solutions

import java.math.BigInteger

fun extraLongFactorials(n: Int): String {
    var bigInteger = BigInteger.valueOf(n.toLong())

    for (i in (n - 1) downTo 1) {
        val mult = when (i) {
            1 -> BigInteger.ONE
            10 -> BigInteger.TEN
            else -> BigInteger.valueOf(i.toLong())
        }

        bigInteger = bigInteger.multiply(mult)
    }

    return bigInteger.toString()
}
