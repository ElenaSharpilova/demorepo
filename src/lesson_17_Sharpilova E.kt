fun main(){
    sayHelloKotlin("Kotlin", 2)

    val max = getMax(3, 7)
    println(max)

    println(getMax(7, 9))
    println(getMax(7.3, 9.4))
    println(getMax(3, 8, 1))

    sayHello("Kotlin", 3)
    sayHello(reps = 2)

    printInts(1, 4, 6, 8, 8)

}

fun sayHelloKotlin(name: String, reps: Int){
    //for (i in 0 until reps)

    var counter = reps
    while (counter > 0) {
        println("Hello $name! Where are you?")
        counter--
    }
}

fun getMax(num1: Int, num2 : Int) = if (num1 > num2) num1 else num2

fun getMax(num1: Double, num2 : Double): Double {
    return if (num1 > num2) num1 else num2
}

fun getMax(num1: Int, num2: Int, num3: Int): Int {
    return when {
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }
}

fun sayHello(name: String = "Java", reps: Int = 1){
    var counter = reps

    while (counter > 0){
        println("Hello $name! Whats app?")
        counter--
    }

}

fun printInts(vararg ints: Int){
    for (i in ints) println(i)
}
