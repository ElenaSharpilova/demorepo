import  kotlin.math.pow

fun main(){
    println(accountInThreeYears(50000, 12.0f, 2))

}

fun accountInThreeYears(presentValue: Int, rate: Float, yearDep: Int): Float {

    return presentValue * (1 + rate / 100).pow(yearDep).toFloat()
}
