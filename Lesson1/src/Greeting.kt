fun main(args: Array<String>){

    val time = args[0].toInt()
    val isHot = if(time < 12) true else false
    println(isHot)

    val message = "Good ${if (time < 12) "morning" else "night"}, Kotlin"
    println(message)
}
