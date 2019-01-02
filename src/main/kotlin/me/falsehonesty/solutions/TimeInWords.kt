package me.falsehonesty.solutions

fun timeInWords(hours: Int, minutes: Int): String {
    return when (minutes) {
        0 -> lowNames[hours].trim() + " o' clock"
        15 -> "quarter past " + lowNames[hours].trim()
        45 -> "quarter to " + lowNames[hours + 1].trim()
        30 -> "half past " + lowNames[hours].trim()
        in 1..29 -> numToWord(minutes) + " ${if (minutes == 1) "minute" else "minutes"} past " + lowNames[hours].trim()
        in 31..59 -> numToWord(60 - minutes) + " ${if (60 - minutes == 1) "minute" else "minutes"} to " + lowNames[hours + 1].trim()
        else -> ""
    }
}

val highNames = listOf("", "ten", "twenty", "thirty", "forty", "fifty")
val lowNames = listOf("", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen")

fun numToWord(num: Int): String {
    if (num < 20) {
        return lowNames[num].trim()
    }

    return highNames[num / 10 % 10] + lowNames[num % 10]
}
