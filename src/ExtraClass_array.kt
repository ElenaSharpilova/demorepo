fun main(){

    var items = arrayOf(5, 7, 2, 9, 11, 599)

    println(items.set(0, 77))
    println(items[0])
    println(items.get(1))
    println(items.size)

    //for(el in items)
        //println(el)

    //items.forEach { el ->
        //println(el)
    //}

    items.forEachIndexed {index, el ->
        println("$el с индексом $index")
    }



}