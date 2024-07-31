open class Animal{
    var gender = "male"
    var hasfeathers = true

    fun sound(){
        println("Animal is speaking")
    }
}

open class Eagle:Animal(){
    var hasscales= true
    var isMammal=true
}

class ostrich:Eagle(){
    fun movement(){
        println("ostrich is walking")
    }
}

fun main() {
    var a = Animal()

    var e = Eagle()

    var o = ostrich()
}