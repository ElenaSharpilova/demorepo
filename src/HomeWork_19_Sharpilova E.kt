fun main(){
    data class Cat (
            val name: String,
            val ageCat: Int,
            var weight: Int,
            var levelSatiety: Int,
            var levelWater: Int
            )

    val barsik = Cat ("Barsik", 2, 4, 5, 2)
    val torik = Cat("Torik", 10, 5, 0, 3)
    println(barsik.toString())
    println(torik.toString())
    println("hashCode Barsik: ${barsik.hashCode()}")
    println("hashCode Torik: ${torik.hashCode()}")
    println(barsik == torik)

    data class Food (
            var name: String,
            var vegetarian: Boolean,
            var numberOfCalories: Int
    )
    val manty = Food("Манты", false, 540)
    val plov = Food ("Плов", true, 300)
    println(manty.toString())
    println(plov.toString())
    println("hashCode плов: ${plov.hashCode()}")
    println("hashCode манты: ${manty.hashCode()}")
    println(plov == manty)

    data class Paper (
            var color: String,
            var numberOfPacks: Int,
            var manufacturingFirm: String
    )

    var snegurka = Paper ("white", 5, "Russia")
    var paper = Paper ("red", 3, "USE")

    println(snegurka.toString())
    println(paper.toString())
    println("hashCode snegurka: ${snegurka.hashCode()}")
    println("hashCode paper: ${paper.hashCode()}")
    println(snegurka == paper)

    data class Worker (val name:String, val surName:String, var position: String)

    val sergei = Worker ("Сергей", "Попов", "менеджер")
    val vladimir = Worker ("Сергей", "Попов", "менеджер")
    println(sergei.toString())
    println(vladimir.toString())
    println("hashCode sergei: ${sergei.hashCode()}")
    println("hashCode vladimir: ${vladimir.hashCode()}")
    println(sergei == vladimir)

    data class Book (val name: String, val author: String, var yearPub: Int)

    val bulgakov1 = Book ("Мастер и Маргарита", "М.Булгаков", 1966)
    val bulgakov2 = bulgakov1.copy(name = "Собачье сердце", yearPub = 1987)
    println(bulgakov1.toString())
    println(bulgakov2.toString())

    val gugo1 = Book ("Отверженные", "В.Гюго", 1862)
    val gugo2 = gugo1.copy(name = "Человек, который смеется", yearPub = 1869)
    println(bulgakov1.toString())
    println(bulgakov2.toString())

}