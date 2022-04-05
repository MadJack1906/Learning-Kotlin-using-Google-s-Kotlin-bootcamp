fun main() {
    // Lambdas and Higher order functions in Kotlin
    // Lambda expressions makes function that doesn't have a name

    // Example of a lambda expression
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    // function types
    val waterFilterFunctionType: (Int) -> Int = { dirty -> dirty / 2 }
    println("Function Type: ${waterFilterFunctionType(dirtyLevel)}")

    println("Higher Order Function: ${updateDirty(dirtyLevel, waterFilter)}")
    println("Higher Order Function while having a named function as its argument ${updateDirty(20, ::increaseDirty)}")

    // Last parameter call syntax
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 1200 } // passing the lambda expression as argument to the function paramter
    println("Last Parameter call syntax:  $dirtyLevel")
}

// an example of a higher order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1 // A compact function