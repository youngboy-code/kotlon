fun main() {

    println("eMobilis")

    var squareroot = Math.sqrt(144.0)

    println("The squareroot is $squareroot")

    var round = Math.round(32.89)
    println("the answer $round")


    var myceil = Math.ceil(45.67)

    println(myceil)

    month()
    multiply()
    students("Youngboy",19)



}




//user defined functions

fun month(){
    println("the month is july")
}

fun multiply(){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)

}

//Parameter and arguments
fun students(name : String,age :Int){
    println("$name is $age years old")

}
