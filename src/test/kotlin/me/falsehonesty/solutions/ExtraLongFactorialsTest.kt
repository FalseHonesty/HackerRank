package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class ExtraLongFactorialsTest {
    @Test
    fun `test input one`() {
        val input = 25
        val expect = "15511210043330985984000000"

        val output = extraLongFactorials(input)

        assert(output).toBe(expect)
    }
}
