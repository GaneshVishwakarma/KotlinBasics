package practice

fun main(args:Array<String>){

    print("Enter the first number")
    var one:Int= readLine()!!.toInt()
    print("Enter the second number")
    var two:Int= readLine()!!.toInt()

    swap(one,two)
}

fun swap(a:Int,b:Int){
    print("before swap \n a=$a and b=$b")
    var temp:Int
    var a1:Int
    var b1:Int
    a1=a
    b1=b
    temp=a1
    a1=b1
    b1=temp

    println("\n After Swap \n a=$a1 and b=$b1")
}