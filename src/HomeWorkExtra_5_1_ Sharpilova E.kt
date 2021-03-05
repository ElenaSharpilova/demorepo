fun main(){
    val age = readLine()!!.toInt()
    if (age >= 1 && age <= 200){
        val lastDigit: Int = age % 10
        println(lastDigit)
        var ageStr = ""

        if (age - lastDigit == 10 || age - lastDigit == 100) { // 10 - 19 лет, 110 - 119 лет
            ageStr = " лет"
        } else if (lastDigit == 0) {
            ageStr = " лет"
        } else if (lastDigit == 1) {
            ageStr = " год"
        } else if (lastDigit <= 4) {
            ageStr = " года"
        } else {
            ageStr = " лет"
        }
        println("Вывод: $age - $ageStr")
    } else {
        println("Число не может быть больше 200 или меньше 1")
    }



//    val n = 87

//    if(1 < n && n < 200){
//        println("Мой возраст: $n лет")
//    } else{
//        println("Вам не может быть столько лет! Введите число от 1 до 200")
//    }
}