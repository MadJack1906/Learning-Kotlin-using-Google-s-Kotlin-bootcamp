import java.time.LocalDateTime
import java.util.*

private val randomDay = listOf("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")

fun main() {
    // Learn more about functions in Kotlin
    // Default values and compact functions Kotlin

    feedTheFish()
}

fun swim (speed: String = "fast"){
    println("swimming speed is: $speed")
}

fun shouldChangeWaterCompact(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isDay(day) -> true
        else -> false
    }
}

// Compact Functions
/*
    Compact Functions are useful for making the code readable and also the logic
 */
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isDay(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
    return when{
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun feedTheFish(){
    val randomDay: String = randomDay()
    val food: String = fishFood(randomDay)
    //val shouldChangeWater = shouldChangeWater(randomDay)
    println("Today is $randomDay and the fish ate $food")
    println("Change water: ${shouldChangeWater(randomDay)}")
    println("Change water compact: ${shouldChangeWaterCompact(randomDay)}")
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