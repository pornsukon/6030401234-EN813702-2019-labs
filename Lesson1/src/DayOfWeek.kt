import java.time.LocalDate

fun main(args: Array<String>){

    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is today?")
    val date = LocalDate.now()
    println("Today is ${date.dayOfWeek}")
}