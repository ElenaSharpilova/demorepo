import java.time.Duration

fun main(){
    //Пример для решения №1
    val h1 = 9
    val m1 = 25

    val h2 = 13
    val m2 = 1

    val duration = (h2*60+m2) - (h1*60+m1)
    println(duration)

    // Пример для решения №2
    // val time1 = java.time.LocalTime.of(9,25)
    // val time2 = java.time.LocalTime.of(13, 1)

    // val duration = java.time.Duration.between(time1,time2)
    // print(duration.toMinutes())
}