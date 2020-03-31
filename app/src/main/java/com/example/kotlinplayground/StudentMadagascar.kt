package com.example.kotlinplayground

open class StudentMadagascar(var lastName: String, var course: Int, var yearTaking: Int) {
    open fun study() {
        println("PROGRAMMING!!!!")
    }
}

class Students(
    lastName: String,
    course: Int,
    yearTaking: Int,
    var firstName: String, var kotlinStudy: Boolean = true
) : StudentMadagascar(lastName, course, yearTaking) {

    var speed: Int = 0
        private set

    fun gitSubmit(delta: Int) {
        super.study()
        speed += delta
        print("This is real work now Madagascar student!")
    }

    fun gitSubmitApprovs(delta: Int) {
        if (speed - delta < 0) {
            speed = 0
            return
        }
        speed -= delta
    }

    override fun study() {
        println("Student Madagascar is working on the git submit")
    }

    fun setFirstAndLastName() {
        firstName = "James"
        lastName = "Bond"
    }

    fun printCredentials() {
        println("My first name is $firstName and my last name is $lastName")
    }

    fun kotlinStudy() {
        if (yearTaking < 2) {
            kotlinStudy = false
            course = 1
            return
        }
        kotlinStudy
        course = 2
    }
}

