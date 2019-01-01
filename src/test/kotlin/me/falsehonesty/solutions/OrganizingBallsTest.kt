package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.api.Test

class OrganizingBallsTest {
    private val POSSIBLE = "Possible"
    private val IMPOSSIBLE = "Impossible"

    @Test
    fun `test case one`() {
        val q1 = arrayOf(
            arrayOf(1, 1),
            arrayOf(1, 1)
        )

        val q2 = arrayOf(
            arrayOf(0, 2),
            arrayOf(1, 1)
        )

        val answer1 = organizingContainers(q1)
        val answer2 = organizingContainers(q2)

        assert(answer1).toBe(POSSIBLE)
        assert(answer2).toBe(IMPOSSIBLE)
    }

    @Test
    fun `test case two`() {
        val q1 = arrayOf(
            arrayOf(1, 3, 1),
            arrayOf(2, 1, 2),
            arrayOf(3, 3, 3)
        )

        val q2 = arrayOf(
            arrayOf(0, 2, 1),
            arrayOf(1, 1, 1),
            arrayOf(2, 0, 0)
        )

        val answer1 = organizingContainers(q1)
        val answer2 = organizingContainers(q2)

        assert(answer1).toBe(IMPOSSIBLE)
        assert(answer2).toBe(POSSIBLE)
    }

    @Test
    fun `test case three`() {
        val q1 = arrayOf(
            arrayOf(999336263, 998799923),
            arrayOf(998799923, 999763019)
        )

        val q2 = arrayOf(
            arrayOf(997612619, 934920795, 998879231, 999926463),
            arrayOf(960369681, 997828120, 999792735, 979622676),
            arrayOf(999013654, 998634077, 997988323, 958769423),
            arrayOf(997409523, 999301350, 940952923, 993020546)
        )

        val answer1 = organizingContainers(q1)
        val answer2 = organizingContainers(q2)

        assert(answer1).toBe(POSSIBLE)
        assert(answer2).toBe(POSSIBLE)
    }
}
