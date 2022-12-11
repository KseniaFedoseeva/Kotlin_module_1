data class User(var firstName : String, var lastName : String, var age : Int) {

    override fun toString(): String {
        return "User [FirstName: $firstName, LastName: $lastName, Age: $age]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (firstName != other.firstName) return false

        return true
    }

    override fun hashCode(): Int {
        return firstName.hashCode()
    }


}