package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class VeryBigSumTest {
    @Test
    fun `test case one`() {
        val input = arrayOf(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)
        val expect = 5000000015L

        val output = aVeryBigSum(input)

        assert(output).toBe(expect)
    }
}
