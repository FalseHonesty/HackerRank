package me.falsehonesty.solutions

import me.falsehonesty.utils.Direction
import me.falsehonesty.utils.XY

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    var pos = XY(r_q, c_q)
    var good = 0
    val bad = obstacles.map { XY(it[0], it[1]) }.toSet()

    for (dir in Direction.values()) {
        pos = pos.off(dir)

        while (!(bad.contains(pos) || pos.x < 1 || pos.x > n || pos.y < 1 || pos.y > n)) {
            pos = pos.off(dir)
            good++
        }

        pos = XY(r_q, c_q)
    }

    return good
}
