package practice

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    //Spread operator unpacks the   array contents
    println(list)

    var newList= asList(1,2,3,"4","five")

    println(newList)
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}