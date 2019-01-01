package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class EncryptionTest {
    @Test
    fun `test case one`() {
        val input = "haveaniceday"
        val expected = "hae and via ecy"

        val output = encryption(input)

        assert(output).toBe(expected)
    }

    @Test
    fun `test case two`() {
        val input = "feedthedog"
        val expected = "fto ehg ee dd"

        val output = encryption(input)

        assert(output).toBe(expected)
    }

    @Test
    fun `test case three`() {
        val input = "chillout"
        val expected = "clu hlt io"

        val output = encryption(input)

        assert(output).toBe(expected)
    }

    @Test
    fun `test case four`() {
        val input = "if man was meant to stay on the ground god would have given us roots"
        val expected = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau"

        val output = encryption(input)

        assert(output).toBe(expected)
    }
}
