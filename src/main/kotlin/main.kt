fun main(){
    var myNameList = NamesIndex(listOf("Wanda","Nyambura","Esther","Robert","Anota","Swabrina","Rehema","Virginia","Nicholas","Nalenyi"))
    var tall = peoplesHeight(listOf(10,11,12,13,14,15))
    println(tall)
    var x = Person("Khloe", 23, 54, 55)
    var y = Person("Daniel", 19, 40, 60)
    var z = Person("Denis", 24, 30, 44)
    var b = Person("Deco", 30, 45, 75)
    var ListPerson = mutableListOf(x,y,z,b)
    var peeps = ListPerson.sortedByDescending {person -> person.age}
    println(peeps)

    var e = Person("Humphrey", 55, 41, 80)
    var f = Person("Yvone", 50, 44, 75)
    var fullList = mutableListOf(e,f)
    println(fullList.plus(ListPerson))


    var Range = Vehicle("KBC1y7k",20)
    var Landcruiser = Vehicle("KBD230M",33)
    var Jeep = Vehicle("KVT185L",45)
    var Nissan = Vehicle("KTS356W",23)
    var locomote = listOf(Range, Landcruiser, Jeep, Nissan)
    println(Car(locomote))
}


fun NamesIndex(names: List<String>): List<String>{
    names.forEachIndexed { index, T ->
        if (index%2==0){
            println(T)
        }
    }
    return names
}

fun peoplesHeight(height: List<Int>): String{
    var sum= height.sum()
    var ave = height.average()
    var total = "$sum, $ave"

    return total

}

 data class Person(var names: String, var age: Int, var height:Int, var weight: Int){

}
fun Morepeople(people2:List<Person>): List<Any>{

    return listOf()
}

 data class Vehicle(var registration: String, var mileage: Int, ){

}

fun Car(taxi:List<Vehicle>):Int{
    var x = 0
    taxi.forEach { y -> y.mileage
        x+=y.mileage

    }
    var total = x/taxi.count()
    return total
}
