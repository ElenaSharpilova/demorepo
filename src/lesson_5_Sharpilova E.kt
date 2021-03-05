fun main(){

    val a = 3
    val b = 2

    if( a >= b || a < b){
        println("if blocked called")
    }
    if(false){
        println("if block called")
    } else if (true){
        println("else if block called")
    }
    else{
        println("else block called")
    }

    val score = 6

    if(score >= 90 && score <= 100){
        println("5")
    }else if(score >= 70 && score < 90){
        println("4")
    }else if(score >= 50 && score < 70){
        println("3")
    }else if(score >= 30 && score < 50){
        println("2")
    }else if(score >= 0 && score < 30){
        println("1")
    }else{
        println("invalid score")
    }

    val n = 99
    val m = 44

    val maxValue = if(n>m){
        println("n is bigger")
        n
    }
    else
        m
}