fun main(){
    val a = 20

    val message =
            when{
                a % 2 == 0 && a % 5 == 0 -> println("a is even and divisible by 5")
                a % 2 == 0 -> println("a is even")
                a % 5 == 0 -> println("a is divisible by 5")
                else -> println("a is not even and divisible by 5")
            }
}