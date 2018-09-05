package sample

/**
 * Created by prathamesh on 12/2/18.
 */
fun main(args: Array<String>){
    val stringList: List<String> = listOf("in", "the", "club","this")
    print(stringList.last( {s : String -> s.length ==4}) )

   /* val russianNames = arrayOf("Maksim", "Artem", "Sophia", "Maria", "Maksim")

    val selectedName = russianNames
            .filter { name -> name.startsWith("m", ignoreCase = true) }
            .sortedBy { name -> name.length }
            .firstOrNull()

    print(selectedName)*/

}

fun retrunIndex(string : String): Boolean{
    return string.length==3
}