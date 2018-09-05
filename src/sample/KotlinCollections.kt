package sample

/*fun sample.sum(number1:Int, number2: Int):Unit{

    println( number1+number2 )
}


fun sample.sum(number1:Int, number2: Int,number3:Int):Unit{

    println( number1+number2+number3 )
}*/

fun main(args: Array<String>) {
    var map= hashMapOf<Int,String>()
    var temp:String?
    map.put(1,"jana")
    map.put(2,"leya")
   // println(map[1])


    /*println(array[1])
    println(array[2])*/
    var setelement= setOf<Int>(10,20,30,40,40)
    for (item in setelement){
        println(item)
    }

    println(sum(4, 5))
}

