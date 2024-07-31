import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("enter first number")

    var num = read.nextInt()

    println("enter second number")

    var num2 = read.nextInt()

    println("your first and second numbers are $num and $num2")

    if (num > num2){

        println("$num2 is rhe smallest number")

    }
    else{
        println("$num is the smallest number")
    }

}