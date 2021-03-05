import com.sun.jdi.IntegerType
import com.sun.jdi.IntegerValue

fun main(){
   //var myList1 = arrayListOf (5, -3, 15, 61, 29, 10, -2, 7)
    //println(myList1.max())

    var myListStr = arrayListOf(5, -3 ,15 ,61 ,29, 10, -2, 7)
    var largeNum = myListStr[0]

    for(number in myListStr){
        if(largeNum < number)
            largeNum = number
    }

    //println("Наибольшее число в массиве: $largeNum")

    var spisok = arrayListOf("5, -3 ,15 ,61 ,29, 10, -2, 7")
   



}