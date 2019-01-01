package me.falsehonesty.solutions

fun encryption(s: String): String {
    val spaceless = s.replace(" ", "")
    val l = spaceless.length
    val sqrtL = Math.sqrt(l.toDouble())
    val columns = Math.ceil(sqrtL).toInt()

    val chunked = spaceless.chunked(columns)

    val sb = StringBuilder()

    for (i in 0 until columns) {
        for (string in chunked) {
            if (i >= string.length) break
            sb.append(string[i])
        }
        sb.append(" ")
    }

    return sb.toString().dropLast(1)
}
