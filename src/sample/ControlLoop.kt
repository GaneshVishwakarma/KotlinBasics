package sample
fun main(args:Array<String>){

    var array= arrayOf(1,2,3,4,5)

    for ((i,v) in array.withIndex())
        println("index $i and value is $v")

   /*loop@ for (count in 1..10){

        for (count2 in 1..5) {
            println("count:$count")
            if(count2==2){
                break@loop
            }
        }

    }

    println(" loop done")
    }
    */



}