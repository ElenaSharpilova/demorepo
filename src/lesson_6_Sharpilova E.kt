fun main(){
    val score = 50

    if(score == 50){
        println("score is 50")
    }

    when (score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 0..29 -> println("1")
        else -> println("invalid score")
    }

    val a = 7
    val b = 4

    val maxValue = when(a>b) {
        true -> a
        false -> b
    }

    println("maxValue: $maxValue")

    when{
        3<2 -> println("3>2")
        "string".length == 6 -> println("lenght is 6")
        2>3 -> println("2>3")
        else -> {
            println("Else called")
        }
    }
}