package orientedObject.domain

class Manager(
    person: Person,
    salary: Double
) : Employee(
    person = person,
    salary = salary
) {
    override val anualBonus: Double get() = salary * 0.2
}