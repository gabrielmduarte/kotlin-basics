package tests

fun main() {
    val n = "21.1"
    val str = "abc"

    println(tryConvert(n))
    println(tryConvert(str))
}

fun tryConvert(string: String):Double? {
    return try {
        string.toDouble()
    } catch (e: NumberFormatException) {
        null
    }
}