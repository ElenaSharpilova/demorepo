import java.util.*

fun main() {

    val torik = Cat("Torik", 10, 5, 0, 3)
    println("Кота зовут ${torik.name}")
    println("Торику ${torik.ageCat} лет")
    println("Уровень голода: ${torik.levelSatiety}")
    println("Уровень воды: ${torik.levelWater}")
    torik.sayCat()
    torik.sleep()
    torik.levelSatiety = 5
    torik.levelWater = 1
    println(torik.levelSatiety)
    println(torik.levelWater)
    torik.sleep()



    val manty = Food("Манты", false, 540)

    var snegurka = Paper ("white", 5, "Russia")

    var shoro = Boiler ("Шоро", true, 5)

    var battery = Battery ("5000 mAh", 100)

    var cocaCola = Liquid ()

    val cupOfTea = Cup ("black", 250, true)
    cupOfTea.empty()

    val box = Box ("металл")
    box.strength()

    val altynai = Student ("Алтынай", "Камбарова", 5, "стоматологический")
    println(altynai.department)

    val sergei = Worker ("Сергей", "Попов", "менеджер")

}

class Cat (
        val name: String,
        val ageCat: Int,
        var weight: Int,
        var levelSatiety: Int,
        var levelWater: Int

){
    fun sayCat(){
        println("Мяу")
    }

    fun sleep(){
        println(if (levelSatiety > 0) "Спит и храпит" else "Орет, хочет кушать")
    }
}

class Food (
        var name: String,
        var vegetarian: Boolean,
        var numberOfCalories: Int
)

class Paper (
        var color: String,
        var numberOfPacks: Int,
        var manufacturingFirm: String
        )

class Boiler (
        val manufacturingFirm: String,
        var fridge: Boolean,
        var bottleVolume: Int
        )

class Battery (powerBattery: String, chargeLevel: Int){
    var powerBattery: String = "3000 mAh"
    var chargeLevel: Int = 60

    init {
        this.powerBattery = powerBattery
        this.chargeLevel = chargeLevel
    }
}

class Liquid ()

class Cup (var color: String, var volume: Int, var tea: Boolean){
    fun empty(){
        println(if (tea == false) "кружка пустая" else "Осторожно! Горячий чай")
    }
}

class Box (var materail: String){
    fun strength (){
        println(if (materail == "металл") "Коробка прочная" else "Хрупкая")
    }
}

class Student (val name:String, val surName:String, val group: Int, val department: String)

class Worker (val name:String, val surName:String, var position: String)





