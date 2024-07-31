fun main() {
    //operator
    var x = 90
    var y = 5

    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x % y)//modulus

    //comparison operators

    var num1 = 45
    var num2 = 30
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)//equal to
    println(num1 != num2) //not  equal to

    //assignment operators
    var number = 10
    println(number)

    number += 2
    println(number)

    //logic operators --&&-and,!-not, ||-or
    println((100 < 20) && (80 < 10))//if all are true
    println((100 < 20) || (80 < 10))//if all are true
    println(!((100 < 20) || (80 < 10)))//if all are true

}



