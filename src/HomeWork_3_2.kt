fun main(){
    print("Введите 1ое число ")
    var sum1: Int = Integer.valueOf(readLine())
    print("Введите 2ое число ")
    var sum2: Int = Integer.valueOf(readLine())
    var res1 = sum1 + sum2

    println("Ответ a + b = $res1")

    print("Введите 1ое число ")
    var sub1: Int = Integer.valueOf(readLine())
    print("Введите 2ое число ")
    var sub2: Int = Integer.valueOf(readLine())
    var res2 = sub1 - sub2

    println("Ответ a - b = $res2")
}