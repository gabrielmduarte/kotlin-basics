package orientedObject.domain

class Manager(
    person: Person,
    salary: Double
) : Employee(
    person = person,
    salary = salary
), SystemAccess {
    override val anualBonus: Double get() = salary * 0.2

    override fun login(password: Int): String {
        return if (password == 1234) {
            "Nice. Login done"
        } else "Ops, something went wrong"
    }
}