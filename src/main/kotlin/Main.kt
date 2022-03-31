import java.util.*

fun main() {
    // Why everthing in kotlin has a value, kotlin.unit
    val isUnit = println("Hello World")
    val temperature = 10
    val isHot = temperature > 50 // if (temperature > 50) true else false

    println(isUnit)
    println(isHot)
    println("The current temperature in the Philippines is: ${if (temperature > 50) "it is hot" else "it is cold"}")


}