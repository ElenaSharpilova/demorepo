fun main() {
    var person = Person("Elina", "Kozhomkulova", 30)
    println(person.name)
    println(person.surname)
    println(person.age)

    person.introduceYourself()

    val employee = Employee("Zoya", "Sharpilova", 54, 30)
    employee.introduceYourself()

}

open class Person(val name: String, val surname: String, val age: Int) {
    open fun introduceYourself() {
        println("My name is $name. I love my cat")
    }
//     var addres: String? = null
//
//     constructor (name: String, surname: String, age: Int, addres: String ) : this(name, surname,age) {
//         this.addres = addres
//
//     }

}

class Employee(name: String, surname: String, age: Int, val experience: Int) : Person(name, surname, age) {

    override fun introduceYourself() {
        println("My name is $name $surname. I have $experience years of experience.")
    }

}