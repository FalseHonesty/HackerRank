package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class NonDivisibleSubsetTest {
    @Test
    fun `test case one`() {
        val k = 3
        val input = arrayOf(1, 7, 2, 4)
        val expected = 3

        val output = nonDivisibleSubset(k, input)

        assert(output).toBe(expected)
    }

    @Test
    fun `test case two`() {
        val k = 4
        val input = arrayOf(19, 10, 12, 10, 24, 25, 22)
        val expected = 3

        val output = nonDivisibleSubset(k, input)

        assert(output).toBe(expected)
    }
}
