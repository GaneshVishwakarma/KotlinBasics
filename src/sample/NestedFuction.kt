package sample

/**
 * Created by prathamesh on 12/2/18.
 */
fun main(args: Array<String>){
    printCircumferenceAndArea(3.0)// The circle circumference of 3.0 radius is 18.85 and area is 28.27

}

fun printCircumferenceAndArea(radius: Double): Unit {

    fun calCircumference(radius: Double): Double = (2 * Math.PI) * radius
    val circumference = "%.2f".format(calCircumference(radius))

    fun calArea(radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)
    val area = "%.2f".format(calArea(radius))

    print("The circle circumference of $radius radius is $circumference and area is $area")
}