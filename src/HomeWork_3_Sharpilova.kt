// ЗАДАНИЕ №1

//var value: String? = null
//lateinit var lateValue: String

//fun main(){

//    value = "Kotlin"
    // println(value?.length)

//    value?.let {
       // println(it.length)
//    }

//    val length = if(value != null){
//        value!!.length
//   } else {
//        -1
//    }
   // println(length)

//    val length2 = value?.length ?: -1
   // println(length2)

//    println(value!!.length)

//    lateValue = "Lena"
//    println(lateValue)
//}

// ЗАДАНИЕ №2
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

