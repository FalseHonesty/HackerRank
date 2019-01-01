package me.falsehonesty.solutions

fun biggerIsGreater(w: String): String {
    var startSub = w.length - 1
    var sub = w.substring(startSub)

    while (sub.length <= w.length / 2) {
        for (i in startSub - sub.length downTo 0 step sub.length) {
            if (sub > w.substring(i, i + sub.length)) {
                return w.substring(0, i) + sub + w.substring(i, startSub)
            }
        }

        startSub--
        sub = w.substring(startSub)
    }

    return "no answer"
}
