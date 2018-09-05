package sample

fun main(args: Array<String>){

    println("Please enter between 1 to 10")
    print("Enter First number")
    val a:Int= readLine()!!.toInt()
    print("Enter Second number")
    val b:Int= readLine()!!.toInt()

    val max=if (a>b) a else b

    if (a!=b) {
        when (max) {
            in 1..10 -> println("Max is $max")
            else -> println(" max is not between 1..10")

        }
    }else{
        println("both numbers are equal")
    }




}