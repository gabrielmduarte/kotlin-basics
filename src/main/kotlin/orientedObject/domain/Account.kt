package orientedObject.domain

class Account(
    val person: Person,
    val accountNumber: Int
) {
    var balance = 0.0

    init {
        println("${person.name} account created successfully with number $accountNumber")
    }

    fun deposit(account: Account, value: Double) {
        this.balance -= value
        println("removing $value from ${this.person.name} account and sending to ${account.person.name}")
        account.balance += value

        println("Deposit done")
        println("account balance ${this.person.name} = ${this.balance}")
        println("account balance ${account.person.name} = ${account.balance}")
    }
}