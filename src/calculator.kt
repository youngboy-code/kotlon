import java.util.Scanner

fun main() {
     var read = Scanner(System.`in`)
    println("Enter first number")

    var num1 = read.nextDouble()

    println("enter an operator( +,-,*,/ ) ")

    var opp = readLine()

    println("enter second number")

    var num2 = read.nextDouble()

    when (opp) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> {
            if (num2 != 0.0) {
                println("Result: ${num1 / num2}")
            } else {
                println("Error: Division by zero")
            }
        }

        else -> println("invalid operation")

    }








}