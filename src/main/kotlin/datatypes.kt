import java.util.*
// java.util.Arrays.toString  <'toString' in lieu of 'Arrays.toString'>

/*
Data Types in Kotlin
    Numbers
        Byte 8 bit
        Short 16 bit
        Int 32 bit
        Long 64 bit
        Float 32 bit
        Double 64 bit
    Characters
        Char
            single quotes [' ']
            4 bit
    Boolean
        Boolean
            True
            False
    Arrays
        collection of values of same data type [mutable & fixed-sized]
            ArrayOf()
            datatypeArrayof()
    Strings
 */

fun main(args: Array<String>){
    // Initialising Numeral Variables
    val i: Int = 100
    val d: Double = 200.25
    val f: Float = 100.02f
    val l: Long = 1234567890L
    val s: Short = 25
    val b: Byte = 2

    println("The value of Int is ${i}")
    println("The value of Double is ${d}")
    println("The value of Float is ${f}")
    println("The value of Long is ${l}")
    println("The value of Short is ${s}")
    println("The value of Byte is ${b}")

    // Initialising Character Variable
    var name: Char
    name = 'K'
    println("Character is: ${name}")

    // Initialising Boolean Variable
    var bool: Boolean
    bool = true
    bool = false
    println("$bool")

    // Initialising Arrays
    // array initialisation
    var arr = arrayOf(1,2,3,4,5)
    println(Arrays.toString(arr))  // Arrays.toString(array)
    // value of index[3] in array[arr]
    println("Value at index[3]: " + arr[3])
    // change value at index[3] to 8
    arr[3] = 8
    // replaced value of index[3] in array[arr]
    println("Value at index[3] after replacing: " + arr[3])
    // get value at index[1]
    println("Value at index[1]: " + arr.get(1))
    // change value at index[0] to 7
    arr.set(0,7)
    println("Change value at index[0] to 7: " + Arrays.toString(arr))
    // add 1 to array
    val arr_plus = arr.plus(1)
    println(Arrays.toString(arr_plus))
    // print first element of array
    println("First element of array: " + arr.first())
    // print last element of array
    println("Last element of array: " + arr.last())
    // index of element 1
    println("Index of 1: " + arr.indexOf(1))
    // number of elements in the array
    println("There are ${arr.count()} elements in the array")
    // even numbers of array
    val Evens = arr.count{it % 2 == 0}
    println("There are $Evens even numbers in the array")
    // sort array in ASC order
    val sortedArr = arr.sortedArray()
    println("Sorted array in ASC order ${Arrays.toString(sortedArr)}")
    // sort array in DESC order
    val sortedArr2 = arr.sortedArrayDescending()
    println("Sorted array in DESC order ${Arrays.toString(sortedArr2)}")
    // 2 Dimensional array
    var arr2D = arrayOf(intArrayOf(2,4), intArrayOf(3,9), intArrayOf(4,16))
    println("2D array is: " + Arrays.deepToString(arr2D))

    // another way of initialising array
    var arr2 = IntArray(5, {i -> i * 2 + 3})
    println(Arrays.toString(arr2))



    // Initialising String Variable
    // STRING TEMPLATE
    var num : Int = 10
    var  num2: Int = 15
    var sum = num + num2
    println("Sum of $num and $num2 is $sum")
    //
    val class_object = Kotlin()  // created object for class Kotlin
    class_object.name = "Kotlin Programming Language"  // claaing method from class
    println("Name: ${class_object.name}")

    // Type Conversion


}