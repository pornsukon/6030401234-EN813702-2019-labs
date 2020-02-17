import kotlin.random.Random

fun main(args: Array<String>){
    feedTheFish()
    swim(100)
    swim(50,speed="slow")
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20): Boolean{
    return true
}
fun swim(time: Int, speed: String = "fast"){
    println("swimming $speed with time $time")
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun randomDay() : String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday")
    return week[Random.nextInt(7)]
}

fun fishFood(day : String) : String{
    var food = "fasting"
    when (day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thrusday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}