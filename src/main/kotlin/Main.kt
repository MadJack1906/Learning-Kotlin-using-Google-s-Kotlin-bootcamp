import java.time.LocalDateTime
import java.util.*

private val randomDay = listOf("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")

fun main() {
    // Learn more about functions in Kotlin
    println(feedTheFish())
}

fun feedTheFish(){
    val randomDay = randomDay()
    val food = fishFood(randomDay)
    println("Today is $randomDay and the fish ate $food")
}

fun randomDay(): String {
    return randomDay[Random().nextInt(randomDay.size)]
}

fun fishFood(day: String): String{
    var food: String = ""
    when (day){
        "MONDAY" -> food = "flakes"
        "TUESDAY" -> food = "pellets"
        "WEDNESDAY" -> food = "redworms"
        "THURSDAY" -> food = "granules"
        "FRIDAY" -> food = "mosquitoes"
        "SATURDAY" -> food = "lettuce"
        "SUNDAY" -> food = "plankton" // rip plankton lmao
        else -> food = "nothing, better check if Marnie is open"
    }
    return food
}