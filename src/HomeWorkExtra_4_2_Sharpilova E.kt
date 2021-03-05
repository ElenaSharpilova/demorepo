fun main(){
    print("Введите 1ое число ")
    var first = readLine()!!.toInt()
    print("Введите 2ое число ")
    var second = readLine()!!.toInt()

    val temporary = first
    first = second
    second = temporary

    println("Числа ПОСЛЕ перехода: Первое : $first и Второе : $second")

}