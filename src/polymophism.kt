open class Shape{
    open fun draw(){
        println("drawing a shape")
    }
}

class Rhombus:Shape(){
    override fun draw(){
        println(" Drawing a rhombus")
    }
}

class Parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {
    var myshape= Shape()
    var myrhombur= Rhombus()
    myrhombur.draw()
    var myparallelogram = Parallelogram()
}