package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class CompareTheTripletsTest {
    @Test
    fun `test case one`() {
        val a = arrayOf(5, 6, 7)
        val b = arrayOf(3, 6, 10)
        val expect = listOf(1, 1)

        val output = compareTriplets(a, b).toList()

        assert(output).toBe(expect)
    }

    @Test
    fun `test case two`() {
        val a = arrayOf(17, 28, 30)
        val b = arrayOf(99, 16, 8)
        val expect = listOf(2, 1)

        val output = compareTriplets(a, b).toList()

        assert(output).toBe(expect)
    }
}
