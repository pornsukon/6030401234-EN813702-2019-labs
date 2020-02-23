fun main(args: Array<String>){
    println("The result of canAddFish(10.0, listOf(3,3,3)) is ${canAddFish(10.0, listOf(3,3,3))}")
    println("The result of canAddFish(8.0, listOf(2,2,2), hasDecorations = false) is ${canAddFish(8.0, listOf(2,2,2), hasDecorations = false)}")
    println("The result of canAddFish(9.0, listOf(1,1,3),3) is ${canAddFish(9.0, listOf(1,1,3),3)}")
    println("The result of canAddFish(10.0, listOf(),7,true) is ${canAddFish(10.0, listOf(),7,true)}")
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize : Int = 2,
    hasDecorations : Boolean = true
) : Boolean{
    if( hasDecorations == true){
        val inFish = tankSize*0.8
        var num = fishSize
        for (i in currentFish.indices) {
            num += currentFish[i]
        }
        return if( num <= inFish) true else false
    } else {
        var num = fishSize
        for (i in currentFish.indices) {
            num += currentFish[i]
        }
        return if( num <= tankSize) true else false
    }
}