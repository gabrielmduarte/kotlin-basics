package basic

fun main() {
    val value = -1.0

    if (value > 0.0 ) {
        println("Value is positive.")
    } else if (value == 0.0 ) {
        println("Value is neutral.")
    } else {
        println("Value is negative.")
    }

    //or

    when {
        value > 0.0 -> println("Value is positive.")
        value == 0.0 -> println("Value is neutral.")
        else -> println("Value is negative.")
    }

    val x = "x"
    when (x) {
        "x" -> println("oi")
        "z" -> print("n vai printa")
    }

}
