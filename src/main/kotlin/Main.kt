fun main(){
    // Filters in Kotlin
    // Filters are used to get an item based on a condition

    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flower pot")
    val eager = decoration.filter { it[0] == 'r' } // An example of eager list
    println("Eager filter: $eager")

    // The lazyFilter now holds a sequence of the list and also condition to apply for the sequence
    val lazyFilter = decoration.asSequence().filter { it[0] == 'p' }
    println("Lazy filter: ${lazyFilter}")
    // To force the evaluation of the list use the toList() function
    val evaluatedList = lazyFilter.toList()
    println("Lazy evaluated list: $evaluatedList")

    // Visualization what's happening when using the asSequence using the 'map()'
    val lazyMap = decoration.asSequence().map {
        println("access: $it")
        it
    }

    println("--------------------------------")
    println("Lazy Map: lazyMap")
    println("--------------------------------")
    println("Lazy Map First element: ${lazyMap.first()}")
    println("--------------------------------")
    println("Lazy Map Last element: ${lazyMap.last()}")
    println("--------------------------------")
    println("Lazy Map all: ${lazyMap.toList() }}")
    println("--------------------------------")

    // Filtered Lazy List Visualization
    val filteredLazyListVisualization = decoration.asSequence().filter { it[0] == 'p' }.map {
        println("filtered access: $it")
        it
    }
    println("Visualization of the filtered lazy list")
    println("--------------------------------")
    println("Filtered List: ${filteredLazyListVisualization.toList()}")
    println("--------------------------------")

    /*
        KeyNote:
            Filters are used to get an element from a list based on a condition

            val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flower pot")
            val filter = decoration.filter{ it[0] == 'p' }

        Eager and Lazy filters
            Eager list: executes immediately and returns the results or the list
            Lazy list:  don't start immediately, it will only start once called
                        Also lazy list lazily evaluates each element of a list from start to end.

            By default, the filter in Kotlin is eager, but you can explicitly set it to
            lazy by using Sequence: asSequence().

            Example of an Eager List:
                val eagerList = decoration.filter{ it[0] == 'p' }

            Example of Lazy List:
                val lazyListSequence = decoration.asSequence().filter{ it[0] == 'p' }

                The asSequence() doesn't actually return the filtered list but rather
                it contains the sequence of the list and also the condition on what to
                apply for that sequence. Printing a sequence list will print the memory
                address of that sequence. To print the list use the toList() function.

            Visualizing the filter list using map()
                You can visualize the lazy evaluation of the asSequence by using the
                map function()

                val visualizeLazyList = decoration.filter { it[0] == 'p' }.map {
                    println("Access: $it")
                    it
                }

     */
}