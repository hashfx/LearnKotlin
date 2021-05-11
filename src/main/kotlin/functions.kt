/*
FUNCTIONS
    inter-related block of code which perform specific task
    Syntax:
        fun function_name(parameters): return type return statement
        {
            statements
        }

LAMBDA FUNCTION
    Syntax:
        var/val function_name:(var_type)->return_type = {var_name: var_type -> return_parameter}

GENERIC FUNCTION
    Function that is declared with type param. When called, actual types are used instead of the type parameters.
    Syntax:
        Class Class_Name{
            Class_Name class_object;  // return type of 's' is 's'
            Val: Int s = 0;  // initialised class_object
        }
    Generic Constraints:
        Set of all possible type that can be substituted for a given parameter
    Upperbound:
        corresponds to java extends keyword
        Syntax:
            class Constraint_name<Constraint_name_object : Parameter>
HIGHER ORDER FUNCTION:
    A function can be passed as a param or returned from a function (recursion); which does both is called as ~
    aka takes function as param and returns another function


 */


// Main method
fun main(args: Array<String>) {
    // using sum function
    println("The sum  is: ${sum(10, 15)}")
    // using add function
    val m: Int = 15
    val n: Int = 35
    var addition: Int = add(m,n)
    println("Addition of $m and $n is $addition")
    val comp: Unit = compare(m,n)

    /* Lambda function
    *   Syntax:
    *       var/val function_name:(var_type)->return_type = {var_name: var_type -> return_parameter} */
    val multiply:(Int,Int)->Int = {num1: Int, num2: Int -> num1 * num2}
    println("20 x 5 = ${multiply(20,5)}")

    // operations on lambda functions
    val myLambda: (Int) -> Unit = {p: Int -> println(p)}
    multiply(5, 9, myLambda)

    // calling twoFun():
    val(two: Int, three: Int) = twoFun(2)
    println("2, $two, $three")

    // multiple arguments
    println("Sum = ${addition(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)}")

    // factorial
    println("7! = ${factorial(7)}")

    /*  HIGHER ORDER FUNCTION  */
    val doSomething: () -> Unit = {}  // function which does nothing

    val doMultiply: (Int, Int) -> Int = {num1: Int, num2: Int -> num1 * num2}  // num2 returns num1*num2
    println("5 x 10 = ${doMultiply(5, 10)}")


}

// function to print sum of two integers
fun sum(a: Int, b: Int): Int
{
    // println(a+b)  // to print a+b just by passing function: sum(a,b)
    return a+b
}

fun add(x:Int, y:Int): Int = x+y  // useful in performing actions on databases or any other program

// Function to compare two numbers
fun compare(a: Int, b: Int){
    if (a>b) println("$a is Greater")
    else if (a==b) println("Both numbers are Equal [$a = $b]")
    else println("$b is Greater")
}


// pass two values to a function
fun twoFun(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2);
}

// multiple arguments in a function
fun addition(vararg result: Int): Int{
    var sum = 0
    result.forEach { n -> sum += n }
    return sum
}

fun factorial(x: Int): Int {
    // TailRecursion function allows the compiler to optimize the byte code by treating recursion as a plain loop
    tailrec fun fact(a: Int, b: Int): Int{
        if (a==0) return b
        else return fact(a-1, a*b)
    }
    return fact(x, 1)
}

// function for myLambda lambda function
fun multiply(x: Int, y: Int, myLambda: (Int) -> Unit){  // unit: return Nothing
    val multiply: Int = x * y
    myLambda(multiply)
}

/*  HIGHER ORDER FUNCTION : Function as a Parameter :: similar to _pass_ keyword */
fun passFunctions(abc: () -> Unit){  // param: abc of type function; returns nothing
    abc()
}



