/*
KOTLIN
    > Open Source
    > By JetBrains
    > Statically typed language
    > Official language for Android Development
    > Runs on JVM
    > First release: Kotlin v1.0 >> February 15, 2016
Etymology
    Kotlin is a name of Island near St. Petersburg
Features
    > Concise : Less boilerplate code
    > Interoperable: JVM
    > Tool-friendly: any IDE or CLI
    > Open-source
    > Trustworthy
    > Easy
    > Less error prone
*/

fun main(args: Array<String>) {

    println("Hello World!")
    // basic input/output
    println("Enter Your Name: ")
    val name = readLine()
    println("Enter your age: ")
    var age: Int = Integer.valueOf(readLine())
    println("The name is $name and age is $age")
}