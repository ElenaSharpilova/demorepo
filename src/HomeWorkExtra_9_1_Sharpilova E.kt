import kotlin.Int as Int1

fun main(){
    var inputNum = readLine()!!.toInt()
    var countNum = inputNum
    var digitNum = 0

    while (countNum > 0){
        digitNum += 1
        countNum /= 10
    }

    println("Количество цифр в числе: $digitNum")
    
}