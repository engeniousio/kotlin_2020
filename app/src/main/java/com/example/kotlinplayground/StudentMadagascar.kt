package com.example.kotlinplayground


class Students(
    var lastName: String,
    var course: Int,
    var yearTaking: Int,
    var firstName: String, var kotlinStudy: Boolean = true) {

    var speed: Int = 0
        private set

    fun gitSubmit(delta: Int) {
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

     fun study() {
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

