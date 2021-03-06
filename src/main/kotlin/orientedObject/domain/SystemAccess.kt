package orientedObject.domain

interface SystemAccess {
    fun login(password: Int): String
}