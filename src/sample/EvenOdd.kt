package sample

fun main(args:Array<String>){
    var number:Int= readLine()!!.toInt()

    when{
         isOdd(number) -> print("Number $number is ODD")
        else ->
                print("number $number is even")
    }

}

fun isOdd(number:Int): Boolean {
    if (number%2==1) return true

    return false
}