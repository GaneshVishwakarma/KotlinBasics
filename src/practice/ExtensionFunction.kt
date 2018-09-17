package practice

fun main(args: Array<String>){
    val l = mutableListOf(1, 2, 3)
    println("list before : "+l)
    l.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'l'
    println("list After : "+l)

}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}