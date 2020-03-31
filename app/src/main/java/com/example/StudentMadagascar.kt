package com.example.kotlinplayground

open class StudentMadagascar (firsLastName: String, course:String, yearTaking: Int ){
    open fun study(){
        println("PROGRAMMING!!!!")
    }
}
class Student(
    kotlinStudy: String,
        firstLastName: String,
        course: String,
        yearTaking: Int,
        firstName: String): StudentMadagascar(firstName, course, yearTaking ){

    var speed: Int = 0
    private set

    fun gitSubmit(delta: Int) {
        super.study()
        speed += delta
        print("This is real work now Madagascar student!")
    }
    fun gitSubmitApprovs(delta: Int){
        if (speed - delta <0){
            speed = 0
            return
        }
        speed -= delta
    }
    override fun study(){
        println("Student Madagaskar is working on the git submit")
    }
}

