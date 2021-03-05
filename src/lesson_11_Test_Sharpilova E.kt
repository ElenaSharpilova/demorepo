//var myMap: HashMap<String, String>? = null

fun main() {

    val names = arrayOf("KG", "RU", "USA", "TR")

    val code = arrayOf("+996", "+7", "+1", "+98")

    var myMap = HashMap<String, String>()
            .apply { for (i in names.indices) this[names[i]] = code[i] }
    println(myMap)
    println(myMap.get("KG"))

    

}
