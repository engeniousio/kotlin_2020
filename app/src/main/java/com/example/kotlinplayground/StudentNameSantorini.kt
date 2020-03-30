package com.example.kotlinplayground

class StudentNameSantorini(
            private val nameOfStudent: String,
            private var mathNumber: Int,
            private var chemistryNumber: Int,
            private var linguisticsNumber: Int) {

    fun averageNumber () :Double {
        val averageNumber: Double = ((mathNumber + linguisticsNumber + chemistryNumber)/3).toDouble()
        return averageNumber
    }

    fun studentInfo() {
        println("Student $nameOfStudent average number is ${averageNumber()}")
    }
}

