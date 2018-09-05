package sample

/**
 * Created by prathamesh on 13/2/18.
 */

class Demo {
    var str: String=""
    var age: Int?=0
    constructor(string: String){
        str=string
    }

    constructor(age : Int)  {
        this.age=age
    }

    fun getstr():String{
        return str
    }

    fun getAge():Int{
        return this.age!!
    }

}

fun main(args:Array<String>){
    var demo= Demo("xyz")
    var agedemo= Demo(10)
    println(demo.getstr())
    println( agedemo.getAge())
}