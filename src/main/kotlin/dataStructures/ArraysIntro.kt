package dataStructures

fun main() {
//    simpleIntArray()
//    println("--------------------")
//
    val dois: Int? = 2
    val tres: Int? = 3
    val nullo: Int? = null

    println(teste(dois))
    println(teste(tres))
    println(teste(nullo))


}

fun simpleIntArray() {
    val ages = intArrayOf(25,19,52,47)

    var olderAge = Int.MIN_VALUE
    var youngerAge = Int.MAX_VALUE

    ages.forEach { age ->
        if (age > olderAge) {
            olderAge = age
        }
    }

    ages.forEach { age ->
        if (age < youngerAge) {
            youngerAge = age
        }
    }

    println(olderAge)
    println(youngerAge)
}

fun teste(int: Int?) :Boolean{
    int.let {
        return when(int) {
            2 -> true
            else -> false
        }
    }
}


fun simpleDoubleArray() {

    val salarys = doubleArrayOf(1500.00, 3500.90, 7000.00, 4050.50, 1000.60)

    val sum = salarys.sum()

}
