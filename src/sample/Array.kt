package sample
fun main(args: Array<String>){
    var arrayInt=Array<Int>(5){0}
    var newarray= arrayOf(1,"1",2,"2")
    for(index in 0..arrayInt.size-1){
        println("array at $index"+arrayInt[index])
    }

    for((index,value) in newarray.withIndex()){
        if (value is String)
            println("index $index and value is $value ")
    }

   /* for(elements in arrayInt){
        println(elements)
    }*/

    var onemillion=1_000_000
    onemillion+=1_00
    println(onemillion)

    var size=7
    var res=size shl 1
    println(res)

}