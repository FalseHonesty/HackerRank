package me.falsehonesty.solutions

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.verbs.assert
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TimeInWordsTest {
    @ParameterizedTest
    @CsvSource(
        "5, 0, five o' clock",
        "5, 1, one minute past five",
        "5, 10, ten minutes past five",
        "5, 15, quarter past five",
        "5, 30, half past five",
        "5, 40, twenty minutes to six",
        "5, 45, quarter to six",
        "5, 47, thirteen minutes to six",
        "5, 28, twenty eight minutes past five",
        "3, 0, three o' clock",
        "7, 15, quarter past seven"
    )
    fun `test case one`(hours: Int, minutes: Int, expected: String) {
        assert(timeInWords(hours, minutes)).toBe(expected)
    }
}
