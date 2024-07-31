fun main() {
    var firstname = "Timothy"
    var lastname = "youngboy"

    println(firstname)
    //Accessing a character in a string
    println(firstname[1])
    // modifying a string
    println(firstname.uppercase())

    println(lastname.lowercase())

    //joining strings
    println(firstname + lastname)
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //string Interpolation

    println("my first name is "+firstname)
    println("my first name is $firstname")

    var num1 = 34
    var num2 = 20

    println("the sum of $num1 and $num2 is "+(num1 + num2))





}