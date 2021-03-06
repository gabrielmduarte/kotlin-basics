package tests

fun main() {
    val int = 1
    val double = 1.2
    val str = "String"
    val bool = true

    printAnyObject(int)
    printAnyObject(double)
    printAnyObject(str)
    printAnyObject(bool)
}

fun printAnyObject(any: Any) {
    println("----------------")
    println(any)
}