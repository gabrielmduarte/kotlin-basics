package orientedObject.domain

class Director(
    person: Person,
    salary: Double
) : Employee(
    person = person,
    salary = salary
), SystemAccess {
    override val anualBonus: Double get() = salary * 0.5

    override fun login(password: Int): String {
        return when {
            password == 1234 -> "Nice. Login done"
            else -> "Ops. Something went wrong"
        }
    }
}