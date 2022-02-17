fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you are $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Alfian, and you 19 years old
Your name is Alfian
*/