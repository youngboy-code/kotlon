fun main() {
    for (number in 20 .. 25){

        println("numer ; $number")
    }

    for (letter in 'b'..'j'){
        println("letter ; $letter")
    }

    for (num in 100 .. 104){
        if (num == 103){
            break
        }

        println(num)
    }


    for (myletter in 'a'..'d'){
        if (myletter == 'b'){
            continue
        }
    println("my letter ; $myletter")
    }

}