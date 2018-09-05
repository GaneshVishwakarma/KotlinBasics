package sample
class Outer {

    private  val name:String?=null

   inner class Nested {
        
        fun Show(){
            println(name)
        }
    }

}


fun  main(args:Array<String>){

   var outer= Outer()
    //var nested=sample.Outer.Nested()
   // nested.Show()


}