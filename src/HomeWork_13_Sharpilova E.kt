 fun main(){
     fun bubbleSort(arr:IntArray):IntArray{
         var swap = true
         while(swap){
             swap = false
             for(i in 0 until arr.size-1){
                 if(arr[i] > arr[i+1]){
                     val temp = arr[i]
                     arr[i] = arr[i+1]
                     arr[i + 1] = temp

                     swap = true
                 }
             }
         }
         return arr
     }
     val list = bubbleSort(intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3))
     for (k in list) print("$k ")
     

 }
