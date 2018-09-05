package sample

/**
 * Created by prathamesh on 19/2/18.
 */


 class Test1( fname: String){
    var firstname:String

    init {
        firstname=fname
    }
    constructor(fname: String,ln: String) : this(fname){
        println(fname + ln)
    }
}

fun main(args: Array<String>){
    var v= Test1("abc")
    var v1= Test1("abc", "xyz")
    print(v.firstname)

}