package practice

data class User(val name: String, val id: Int,val age:Int,val email:String)

fun getUser(): User {
    return User("Alex", 1,20,"myemail@yopmail.com")
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name = ${user.name}, id = ${user.id}")

    // or

    val (name, id, age, email) = getUser()
    println("name = $name, id = $id, age = $age, email = $email")

    // or

    println("name = ${getUser().component1()}, id = ${getUser().component2()}")
    println("age = ${getUser().component3()}, email = ${getUser().component4()}")

    var newuser=User("Bob",2,21,"bob@yopmail.com")

    println("------------new user-------------")

    println("name = ${newuser.component1()}")
    println("id = ${newuser.component2()}")
    println("age = ${newuser.component3()}")
    println("email = ${newuser.component4()}")
}