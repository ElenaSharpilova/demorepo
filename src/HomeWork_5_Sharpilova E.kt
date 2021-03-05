fun main(){
    println("Введите четырехзначное число")
    val num = readLine()!!.toInt()
    val result: Boolean

    if(num % 10 + num / 10 % 10 == num / 100 % 10 + num / 1000) {
        result = true
    } else {
        result = false
    }
    println(result)
}