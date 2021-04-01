fun main(){
    val array = intArrayOf (10, 2, 10, 3, 1, 2, 5, 2, -1, 3)
    println(array.contentToString())
    val n = array.size
    var temp = 0
    for (i in 0 until n)
    {
        for (j in 1 until n - i){
            if (array[j - 1] > array[j]) {
                temp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = temp

            }
        }

    }
    println(array.contentToString())
}