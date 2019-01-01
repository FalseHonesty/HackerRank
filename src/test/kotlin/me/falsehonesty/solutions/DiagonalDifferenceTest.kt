package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class DiagonalDifferenceTest {
    @Test
    fun `test case one`() {
        val input = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )
        val expect = 15

        val output = diagonalDifference(input)

        assert(output).toBe(expect)
    }
}
