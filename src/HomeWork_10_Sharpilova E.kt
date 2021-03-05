fun main(){
    val itemCosts = mapOf("Хлеб" to 60, "Молоко" to 60, "Сыр" to 60)
    val shopingList = listOf("Хлеб", "Молоко", "Сыр", "Колбаса")

    var totalCost = 0

    for (item in shopingList){
        val itemCost = itemCosts[item]
        if (itemCost!= null) {
            totalCost += itemCost
        }

    }

    println("Стоимость покупки $totalCost")


}
