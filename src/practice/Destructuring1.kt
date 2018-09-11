package practice

fun main(args: Array<String>) {
    val pair = Pair(1, "one")

    val newpair=Pair(2,"second")
    val (num, name) = pair

    println("num = $num, name = $name")

    println("component 1 ${pair.component1()}")
    println("pair first ${pair.first}")

}

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

/*data class Result(val result: Int, val status: String)
fun function(result:Int ,status:String): Result {
    // computations

    return Result(result, status)
}

fun main(args:Array<String>){
    // Now, to use this function:
    val (result, status) = function(80,"Pass")
    print("result: ${result} || status: ${status}")
}*/

