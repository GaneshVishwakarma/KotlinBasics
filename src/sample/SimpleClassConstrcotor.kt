package sample

/**
 * Created by hussienalrubaye on 12/31/17.
 */

class CarConstruct(){
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    constructor( type:String, model:Int,  price:Double,
                 milesDrive:Int, owner:String):this(){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
        println("constructor1")

    }

    constructor(owner: String) : this() {
        this.owner=owner
        println("constructor2")
    }

    fun getCarPrice():Double {

        return this.price!! - ( this.milesDrive!!.toDouble()*10)
    }
}



fun  main(args:Array<String>){

    val huCar= CarConstruct("BMW", 2015, 10000.0, 105, "Hussein")
    println("huCar:"+ huCar.getCarPrice())
    val jeCar= CarConstruct("KA", 2017, 2000.0, 1, "Jena")
    println("jeCar:"+ jeCar.getCarPrice())
    val laCar= CarConstruct("laya")
}