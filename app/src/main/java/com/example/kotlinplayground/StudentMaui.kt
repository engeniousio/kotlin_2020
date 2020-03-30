package com.example.kotlinplayground

class StudentMaui(
    private val name: String,
    private val course: String,
    private val degree: String,
    private var yearAttending: Int
) {
    private var isPassed: Boolean? = null

    fun passed() {
        isPassed = true
    }
    fun failed() {
        isPassed = false
    }
    fun printStats() {
        println(" Student name: $name course: $course degree: $degree year: $yearAttending passed: $isPassed")
    }
    fun changeYearAttending(year: Int) {
        yearAttending = year
    }

}



