package tests

import orientedObject.domain.Person

fun main () {
    val person = Person("Gabriel", "Testando", "143673")
    printName(person)
    printName("x")
}

fun printName(person: Any) {
    if(person is Person) {
        println(person.name)
    } else println("F. Try again")
}