import java.util.Scanner


fun main() {

    var read = Scanner(System.`in`)

    println("imput the temperature of your patient")
    var temperature = read.nextDouble()


    if (temperature > 37){

        println("high temperature")
    }
    else if (temperature < 37){

        println("low temperature")

    }

    else{
        println("normal temperature")
    }



}