/*
Inheritance:
    Inheritance is a feature using which a class inherits all the features of another class
    EXAMPLE:

        Teacher         Player         Businessman
          walk()          walk()         walk()
          talk()          talk()         talk()
          person()        person()       person()
          teach()         run()          business()

      Common methods [walk(), talk(), person()] can be inherited from one class to another classes


 */

open class MainClass{  // open keyword makes base class accessible to derived class
    open fun run(){  // makes method accessible for overridden
        println("The person can run")
    }
}

class Derived: MainClass() {
    override fun run(){  // function can be overridden inside derived class
        println("Person can't run")  // Method has been overridden and would be shown in the output
    }
}


fun main(args: Array<String>) {
    var derived1 = Derived()
    derived1.run()
}