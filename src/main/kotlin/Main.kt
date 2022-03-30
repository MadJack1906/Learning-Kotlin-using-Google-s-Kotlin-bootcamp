import java.util.*

fun main() {
    // Immutable List
    val fishList = listOf("Saint Peter's Fish", "Milk Fish", "Mudkip")
    //println(fishList)

    // Mutable List
    var mutableList = mutableListOf("Saint Peter's Fish", "Milk Fish", "Mudkip")
    mutableList.remove("Milk Fish")
    //println("Mutable List $mutableList")

    // Arrays
    val arrayOne = arrayOf(1, 2, 3)
    val arrayTwo = arrayOf(4, 5, 6)
    val combinedArrays = arrayOne + arrayTwo
    println(combinedArrays[5])

    // Nested List
    val numbers = intArrayOf(1,2,3)
    val computerParts = listOf("Keyboard", "Monitor", "Mouse")
    val nestedList = listOf(numbers, computerParts, "Water")
    println(Arrays.toString(arrayOne))
    println(nestedList)

    // Nested List
    val list = Array(5) { it * 5 }
    println(list.contentToString())

    // Loops
    val school = arrayOf("shark", "salmon", "minnow")
    // iterating through element
    print("Iterating through element: ")
    for(element in school){
        print("$element ")
    }
    println()
    // iterating with element and index
    for((index, element) in school.withIndex()){
        println("Item at $index is $element")
    }

    // Loops: Ranges and steps
    // loop with range
    for (i in 1..5){
        print(i)
    }
    println()
    // decrementing loop
    for (i in 5 downTo 1){
        print(i)
    }
    println()
    // modified step incrementor/decrementor
    for (i in 1..6 step 2){
        print(i)
    }
    println()
    // looping characters
    for (i in 'g'..'m') print(i)
    println()

    // while loop
    var bubbles = 0
    while (bubbles < 10){
        bubbles++
    }

    // do while loop
    do{
        bubbles--
    }while (bubbles > 0)

    // repeat
    repeat(5) {
        println("Print this: $it")
    }
}