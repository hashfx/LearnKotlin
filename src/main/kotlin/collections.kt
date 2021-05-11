/*
COLLECTIONS:
    Collections in Kotlin are used to store group of related objects in a single unit.
Collections in Kotlin:
    List:
        ordered collection with access to elements by indices. Elements can occur more than once in s list
        Syntax:
            var/val list_name = listOf<datatype of list>(elements)
    Set:
        collection of unique elements
        Syntax:
            var/val set_name: Set<datatype of set> = setOf(elements)
    Map:
        set of key-value pairs
        Syntax:
            var/val map_name: Map<key_data_type, value_data_type> = mapOf<key_data_type, value_data_type>(key to value)

 */



fun main(args: Array<String>) {
    /* LIST */
    var square = listOf<Int>(1, 4, 9, 16, 25, 16)

    println("List in Matrix Form: ")
    for (i in square)
        println(square)  // prints whole-list in matrix form Len(list) times

    println("List in order-wise: ")
    for (i in square)
        println(i)

    println(" List in Linear Order: $square")

    println("List with index values: ")
    for ((i: Int, j: Int) in square.withIndex())
        println("Index:$i :: Value:$j")

    /* MUTABLE LIST */
    println("*-*-*-*-*-Mutable Lists-*-*-*-*-*")
    val numbers: MutableList<Int> = mutableListOf(10, 20, 30, 40)
    println("Real Mutable List: $numbers")
    numbers.add(50)  // add number at last of the list
    numbers.removeAt(1)  // remove element at index[1]
    numbers[0] = 0  // change number at index[0] to 0
    numbers.shuffle()
    println(numbers)

    /* SET */
    println("*-*-*-*-*-SETs-*-*-*-*-*")
    val st: Set<Int> = setOf(1, 2, 3, 4, 5, 1)
    println("Number of elements in the set: ${st.size}")
    // To search an element in the set
    if (st.contains(5)) println("5 is in the Set")
    else println("5 is not in the Set")
    val reverseSet: Set<Int> = setOf(1, 5, 2, 4, 3)
    println("Sets are Equal: ${st == reverseSet}")

    /* Maps */
    println("*-*-*-*-*-Maps-*-*-*-*-*")
    val Maps: Map<String, Int> = mapOf<String, Int>("key" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println("All Keys are: ${Maps.keys}")
    println("All Values are: ${Maps.values}")
    if ("key2" in Maps) println("Value of key 'key2' : ${Maps["key2"]}")
    if (1 in Maps.values) println("Value 1 is in the map")


}