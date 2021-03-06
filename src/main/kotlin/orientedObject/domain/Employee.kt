package orientedObject.domain

open class Employee(
    val person: Person,
    val salary: Double,
) {
    open val anualBonus: Double get() = salary * 0.1
}