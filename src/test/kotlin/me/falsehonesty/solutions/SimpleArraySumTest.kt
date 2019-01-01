package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class SimpleArraySumTest {
    @Test
    fun `test input one`() {
        val input = "1 2 3 4 10 11".split(" ").map{ it.trim().toInt() }.toTypedArray()

        val output = simpleArraySum(input)

        assert(output).toBe(31)
    }
}
