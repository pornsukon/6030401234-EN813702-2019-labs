import kotlin.random.Random

fun main(args: Array<String>){
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birth : Int?): String {
    val fortune = listOf("You will have a great day!","Things will go well for you today.","Enjoy a wonderful day of success."
        ,"Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    return when(birth) {
        in 1..7 -> "Have a good start the first week of month"
        28,31 -> "Enjoy that last days of month"
        !in 1..31,null -> "Please enter a valid birthday (1-31)"
        else -> "${fortune[Random.nextInt(7)]}"
    }
}

fun getBirthday(): Int? {
    print("Enter your birthday: ")
    val birthday = readLine()!!.toIntOrNull()
    return birthday
}