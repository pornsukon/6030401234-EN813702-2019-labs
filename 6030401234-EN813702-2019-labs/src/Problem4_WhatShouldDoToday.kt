fun main(args: Array<String>){
    print(whatShouldDoToday("happy"))
}

fun whatShouldDoToday(mood : String, weather: String = "sunny",temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny"-> "go for a walk"
        else -> "Stay home and read."
    }
}