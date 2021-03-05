fun main(){

    val a = 77

    val message =
            if (a % 2 == 0 && a % 5 == 0) {
                println("a is even and divisible by 5")
            } else if (a % 2 == 0 ){
                println("a is even")
            } else if (a % 5 == 0 ){
                println("a is divisible by 5")
            } else {
                println("a is not even and divisible by 5")
            }


}