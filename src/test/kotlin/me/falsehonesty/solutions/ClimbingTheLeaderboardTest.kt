package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class ClimbingTheLeaderboardTest {
    @Test
    fun `test case one`() {
        val scores = arrayOf(100, 100, 50, 40, 40, 20, 10)
        val alice = arrayOf(5, 25, 50, 120)
        val expect = listOf(6, 4, 2, 1)

        val output = climbingLeaderboard(scores, alice).toList()

        assert(output).toBe(expect)
    }

    @Test
    fun `test case two`() {
        val scores = arrayOf(100, 90, 90, 80, 75, 60)
        val alice = arrayOf(50, 65, 77, 90, 102)
        val expect = listOf(6, 5, 4, 2, 1)

        val output = climbingLeaderboard(scores, alice).toList()

        assert(output).toBe(expect)
    }
}
