package sample

 fun main(args: Array<String>) {
    /*data class User(val name: String = "", val age: Int = 0)
    var arrayList=ArrayList<User>()
    arrayList.add(User("ganesh"))
    arrayList.add(User("shantaram",25))

     print(arrayList.get(0).name)
     for (item in arrayList){
         println(item)
     }*/


     var arraylist= ArrayList<String>()
     arraylist.add("jena")
     arraylist.add("Laya")
     arraylist.add("Hussein")
     arraylist.add("Ahmed")

     println("First name:"+ arraylist.get(0))
     arraylist.set(0," Laya Hussein")

     println(" all element by object")
     for ( item in arraylist){
         println(item)
     }

     println(" all element by index")
     for( index in 0..arraylist.size-1){
         println(arraylist.get(index))
     }

     // Search
     if( arraylist.contains("Hussein")){
         println(" name is found")
     }else{
         println(" name is not found")
     }



}