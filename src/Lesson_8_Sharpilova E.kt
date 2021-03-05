fun main(){

    /* Array */

    val myArray = arrayOf(1, 2, 3, 4, 5)

    //myArray[0] = 42
    //myArray[4] = 322

    println(myArray[0])
    println(myArray[1])

    /* ArrayList */

    val myArrayList = ArrayList<Int>()

    myArrayList.add(10)

    println(myArrayList[0])
    println(myArrayList.size)

    val myArrayList1 = arrayListOf("Javascript", "C++")

    myArrayList1.add("Kotlin")
    myArrayList1.add("Java")
    myArrayList1.add("Dart")
    myArrayList1.add(1, "Python")
    myArrayList1.removeAt(2)

    println(myArrayList1)
    println(myArrayList1.size)

}