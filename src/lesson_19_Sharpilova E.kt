fun main(){
    data class Employee (
            val name: String,
            val surname: String,
            val age: Int,
            val experionce: Int
            )
    val person1 = Employee ("Elena", "Sharpilova", 32, 7)
    val person2 = person1.copy(surname = "Kozhomkulova")

    println(person1.toString())
    println("person2: $person2")
    println(person1 == person2)
}