
import java.util.Scanner

fun main() {
    println("Enter letter")
    var letter = readln().single()

    if (letter == 'a' || letter == 'e' || letter == 'i' || letter =='0' || letter=='u') {
        println("$letter is a vowel")
    }

    else {
        println("$letter is a consonant")
    }




}