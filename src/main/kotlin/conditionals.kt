fun main() {

    val age = 20
    if (age < 18){
        println("You can't Vote!")
    } else {
        println("You can Vote!")
    }
    // If if block is used alone, no need to use { curly brackets }
    if (age == 20)
        println("Your age is $age")

    val name = "Name"
    when (name){
        "Name" -> {
            println("Your name is $name")
        }
        else->{
            print("You are not!")
        }
    }

}
