package practice

import kotlin.reflect.KProperty

/*********************Start - example 1******************/
/*interface Nameable {
    var name: String
}

class JackName : Nameable {
    override var name: String = "Jack"
}

class LongDistanceRunner: Runnable {
    override fun run() {
        println("long")
    }
}

class Person(name: Nameable, runner: Runnable): Nameable by name, Runnable by runner

fun main(args: Array<String>) {
    val person = Person(JackName(), LongDistanceRunner())
    println(person.name) //Jack
    person.run() //long
}*/

/*********************End - example 1******************/


/*********************Start - example 2******************/
class Example {
    var p: String by NewDelegate()

    override fun toString() = ""
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

class NewDelegate(){
    operator fun getValue(thisRef: Any?, prop: KProperty<*>):String{
        return "${prop.name}"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String){
        println("New Value ${value}")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "NEW"
    var value=e.p
    println(value)
}

/*********************End - example 2******************/
