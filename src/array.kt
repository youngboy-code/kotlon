fun main() {
    var courses = arrayOf("MIT", "Android", "Data Science")

    println(courses[1])

    //reassigning an element in array
    courses[1] = "Web Development"

    println(courses[1])

    //looping through an array

    var newcourse= courses.plus("Cybersecurity")
    for (course in newcourse){

        println(course)
    }


    //size of an array
    println(courses.size)
    println(newcourse.size)

    println(5000*5)
}