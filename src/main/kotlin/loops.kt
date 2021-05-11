fun main(args: Array<String>) {
    /*
    For Loop Syntax:
        for (item in collection)
        {
            body  // does not requires { curly brackets } if only one statement is inside
        }
     */

    for (i in 1..5)  // range 1 to 5
        println(i)

    /*
    While Loop Syntax:
        while(condition)
        {
            body
        }
     */
    var i: Int = 0
    while (i < 5)
    {
        println("Value is: $i")
        i++
    }
    println("Value of i after loop end is $i")

    /*
    Do While Syntax:
        do{
            body
        } while (condition)
     */

    do {
        println("Value in Do...While is: $i")
        i++
    } while (i > 7)  // Condition is false...only do statement will execute

    /*
    When Syntax : same as Switch
        when{
            cases
        }
     */

     var x: Int = 19
     when(x){
         0,1 -> println("x = $x")
         else -> println("x is $x")

     }
    when(x) {  // to check if number is in specified range or not
        in 1..10 -> println("Number is in range of (1,10)")  // executes when x is in range of 1,10
        !in 10..20 -> println("Number is not in range of (10,20)")  // executes when x is not in range of
        else -> println("Ineligible Input")
    }

    /* JUMP STATEMENTS
    * break aka structural jump expression
    * continue
    * return
    */
    var y: Int = 3
    // break
    loop@ while(x in 1..5) {  // while x is in range 1,5
        while (y in 6..10) {
            println("x = $x and y = $y")
            if (y == 3)
                println("Break...")
                break@loop  // labelled loop as 'loop' is broken  {labelled break}
        }
    }

    // continue
    for (x:Int in 1..4){
        println("x = $x")
        if (x == 2)
            continue
    }






}