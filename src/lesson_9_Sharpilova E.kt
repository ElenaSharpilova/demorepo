fun main(){

    // for loop
    val names = arrayListOf("Kotlin", "Java", "Dart")

    for (i in 0..2){     // можно использавать данный цикл, когда строго знаем сколько у нас элементов в списке
        println(names[i])
    }

    for(j in 0 until names.size){  // можно использать, когда не знаем сколько элементов в списке
        println(names[j])
    }

    for(name in names){  // в данном цикле у нас нет доступа к индексам элементов
        println(name)
    }

    names.forEach { println(it) } // в данном цикле у нас нет доступа к индексам элементов

    names.forEachIndexed { index, name ->  // здесь уже можно обратиться по индексу
        println("$index $name")
    }

    for (k in 0..10 step 3){
        println(k)
    }

    for (f in 10 downTo 0 step 2){
        println(f)
    }

    for ( s in 0..10){ //continue все что стоит после континью игнориться и программа переходит в следующий цикл. В нашем случае мы пропустили 6 т.к. условие s==6
        if(s==6)continue
        println(s)
    }

    for (d in 0..10){
        if(d == 8)break
        println(d)
    }
 println("-------------------------------------------------------")
    // while Если цикл while = false цикл не сработает

    var l = 0
    while(l <= 10){
        println(l)
        l++
    }
    println("-------------------------------------------------------")

    // do while  Если цикл do while = false цикл запуститься хотя бы один раз

    var m = 11
    do {
        println("do while $m")
        m++
    }while (m <= 10)


}