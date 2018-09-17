package practice

fun <R> ArrayList<R>.filterOnCondition(condition: (R) -> Boolean): ArrayList<R>{
    val result = arrayListOf<R>()
    for (item in this){
        if (condition(item)){
            result.add(item)
        }
    }

    return result
}

fun isMultipleOf (number: Int, multipleOf : Int): Boolean{
    return number % multipleOf == 0
}

fun main(args:Array<String>){
    var list = arrayListOf<Int>()
    for (number in 1..10){
        list.add(number)
    }
    var resultList = list.filterOnCondition { isMultipleOf(it, 5) }

    println(resultList)
}