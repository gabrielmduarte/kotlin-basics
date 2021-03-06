package orientedObject

import orientedObject.domain.*

fun main() {
    println("-------------------------")
    testAccountsAndPersons()
    println("-------------------------")
    testEmployeesAndManagers()
    println("-------------------------")
    `test passwords and interface`()
    println("-------------------------")
}

fun testAccountsAndPersons() {
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

fun testEmployeesAndManagers() {
    val odete = Person("Odete", "Meirelles", "456678745")
    val guina = Person("Agnaldo", "Duarte", "1762837")
    val ines = Person("Ines", "Duarte", "04958767")

    val employee = Employee(odete, 10000.00)
    val manager = Manager(guina, 5000.00)
    val director = Director(ines, 12.000)

    println("employee name: ${employee.person.name}")
    println("salary:${employee.salary} bonus:${employee.anualBonus}")
    println("manager name: ${manager.person.name}")
    println("salary:${manager.salary} bonus:${manager.anualBonus}")
    println("director name: ${director.person.name}")
    println("salary:${director.salary} bonus:${director.anualBonus}")
}

fun `test passwords and interface`() {
    val guina = Person("Agnaldo", "Duarte", "1762837")
    val ines = Person("Ines", "Duarte", "04958767")

    val manager = Manager(guina, 5000.00)
    val director = Director(ines, 12.000)

    println("manager login 1234: " + manager.login(1234))
    println("manager login 123: " + manager.login(123))
    println("director login 1234: " + director.login(1234))
    println("director login 123: " + director.login(123))
}