package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class BiggerIsGreaterTest {
    private val NO_ANSWER = "no answer"

    @Test
    fun `test case one`() {
        val input = listOf("ab", "bb", "hefg", "dhck", "dkhc")
        val expected = listOf("ba", NO_ANSWER, "hegf", "dhkc", "hcdk")

        for (i in 0 until input.size) {
            val output = biggerIsGreater(input[i])

            assert(output).toBe(expected[i])
        }
    }

    @Test
    fun `test case two`() {
        val input = listOf("lmno", "dcba", "dcbb", "abdc", "abcd", "fedcbabcd")
        val expected = listOf("lmon", NO_ANSWER, NO_ANSWER, "acbd", "abdc", "fedcbabdc")

        for (i in 0 until input.size) {
            val output = biggerIsGreater(input[i])

            assert(output).toBe(expected[i])
        }
    }
}
