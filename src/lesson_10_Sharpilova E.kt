fun main(){
    // MAP

    val password = "12345"
    val usrname = "esharpilova"
    val name = "Elena"

    val list = arrayListOf("12345", "esharpilova", "Elena")

    // key value
    val myMap = hashMapOf<String, String>()

    myMap.put("password", "12345")
    myMap.put("usrname", "esharpilova")
    myMap.put("name", "Elena")
    myMap.put("name2", "Gosha")
    myMap.put("name3", "Ellen")


    //myMap.remove("name")

    println(myMap.entries)

    println(myMap.get("password"))

    // SET

    val mySet = HashSet<Int>()  //хранит только уникальные значения

    mySet.add(1)
    mySet.add(2)
    mySet.add(1)
    mySet.add(3)
    mySet.add(2)
    mySet.add(1)

    val list1 = arrayListOf(1,2,3,4,4,4,1,1)
    val  mySet2 = HashSet<Int>()
    mySet2.addAll(list1)

    println(mySet)
    println(mySet2)

}