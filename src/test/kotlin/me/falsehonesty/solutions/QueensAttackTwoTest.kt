package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class QueensAttackTwoTest {
    @Test
    fun `test case one`() {
        val n = 4
        val k = 0
        val r_q = 4
        val c_q = 4
        val expected = 9

        val output = queensAttack(n, k, r_q, c_q, arrayOf())

        assert(output).toBe(expected)
    }

    @Test
    fun `test case two`() {
        val n = 5
        val k = 3
        val r_q = 4
        val c_q = 3
        val obstacles = arrayOf(
            arrayOf(5, 5),
            arrayOf(4, 2),
            arrayOf(2, 3)
        )
        val expected = 10

        val output = queensAttack(n, k, r_q, c_q, obstacles)

        assert(output).toBe(expected)
    }

    @Test
    fun `test case three`() {
        val n = 1
        val k = 0
        val r_q = 1
        val c_q = 1
        val expected = 0

        val output = queensAttack(n, k, r_q, c_q, arrayOf())

        assert(output).toBe(expected)
    }
}
