import kotlin.math.sqrt

fun main(){
    var x = readLine()!!.toFloat()
    var y = readLine()!!.toFloat()
    var r = readLine()!!.toFloat()

    var hypotenuse = sqrt(x * x + y * y)

    when {
        hypotenuse <= r -> println("Точка внутри круга")
        else -> println("Точка вне круга")
    }

}