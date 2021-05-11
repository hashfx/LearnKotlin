import java.util.Collections.copy

/*
Data Classes:
    * A data class is like a regular class but with some additional functionalities
    * Contains only *getters* and *setters* referred as ** and ** methods
    * Containers of data used by other classes which do not contain any additional functionality and cannot operate
        independently on data on their-own
    * Getters and Setters are automatically generated after declaring/using 'data class'

Restrictions of Data Class:
    * Primary constructor needs to have at least one parameter
        whenever a class is created; at least one param is mandatory
    * All primary constructor needs to be marked as Val or Var
        without specifying, it is a Var
    * Data Classes cannot be abstract, open, sealed or inner
        they cannot be instantiated but can be sub-classed
    * They cannot extend other classes
        Data Classes will work only with the class they are working it.
        They cannot be inherited or cannot work in child classes but it can implement its interface very easily

Destructing Declarations:
    * destruction of objects into number of variables

 */

data class User(val name: String, val age: Int) // has no setters due to val
    val MyClass = User("MyName", 18)
    val MyClassCommunity = MyClass.copy(age = 18)

fun main(args: Array<String>) {

}