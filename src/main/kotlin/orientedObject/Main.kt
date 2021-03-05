package orientedObject

fun main() {
    val abel = Person("Abel", "Ferreira", "456678745")
    val accountAbel = Account(abel, 1122)
    accountAbel.balance = 100.0

    println("person name: ${accountAbel.person.name}")
    println("person last name: ${accountAbel.person.lastName}")
    println("account balance: ${accountAbel.balance}")

    val guina = Person("Agnaldo", "Duarte", "1762837")
    val accountGuina = Account(guina, 9876)
    accountGuina.balance = 100.0

    accountAbel.deposit(accountGuina, 50.1)
}