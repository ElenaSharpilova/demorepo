fun main(){
    var i = 1

    while(i < 5){
        println("* * * * *")
        i++
    }

    println("--------------------------------------------")

    for (j in 1..4){
        println("* * * * *")
    }

    println("--------------------------------------------")

    for (t in 1..5){
        if (t == 1 ){
            println("*")
        } else if (t == 2){
            println("* *")
        } else if (t == 3) {
            println("* * *")
        } else if (t == 4){
            println("* * * *")
        } else {
            println("* * * * *")
        }

    }
    println("--------------------------------------------")

    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

    println("--------------------------------------------")

    var n=5

    for (i in 0 .. n){
        for (j in 0.. n-i){
            print(" ")
        }

        for (k in 0.. i){
            print("*")
        }
        println(" ")
    }

}