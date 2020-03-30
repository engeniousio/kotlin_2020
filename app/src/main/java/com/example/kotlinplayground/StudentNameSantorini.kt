package com.example.kotlinplayground

import kotlin.random.Random

class StudentNameSantorini(
            private val nameOfStudent: String,
            private var mathNumber: Int,
            private var chemistryNumber: Int,
            private var linguisticsNumber: Int) {

    fun mathExam5(): Int {
        mathNumber = 5
        return mathNumber
    }
    fun chemistryExam5(): Int {
        chemistryNumber = 5
        return chemistryNumber
    }
    fun linguisticsExam5():Int {
        linguisticsNumber = 5
        return linguisticsNumber
    }


    fun averageNumber () :Double {
        val mathNumber = mathExam5()
        val linguisticsNumber = linguisticsExam5()
        val chemistryNumber = chemistryExam5()
        val averageNumber: Double = ((mathNumber + linguisticsNumber + chemistryNumber)/3).toDouble()
        return averageNumber
    }

    fun studentInfo() {
        println("Student $nameOfStudent average number is ${averageNumber()}")
    }
}

