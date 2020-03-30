package com.example.kotlinplayground

import kotlin.random.Random

class StudentNameSantorini() {
    val numberOfStudentsInGroup: Int = 100
    var yearMathExam: Boolean = false
    var yearChemistryExam: Boolean = false
    var yearLinguisticsExam: Boolean = false
    var randomInt = Random.nextInt(0,1)
    

    fun exam(): Boolean {
        // if randomInt 0 - exam failed, id randomInt is >0 exam passed
        randomInt = Random.nextInt(0,15)
        if (randomInt==0) {
            yearMathExam = false
        } else {
            yearMathExam = true
        }
        
        randomInt = Random.nextInt(0,14)
        if (randomInt==0) {
            yearChemistryExam = false
        } else {
            yearChemistryExam = true
        }

        randomInt = Random.nextInt(0,16)
        if (randomInt==0) {
            yearLinguisticsExam = false
        } else {
            yearLinguisticsExam = true
        }
        
        if (yearLinguisticsExam && yearChemistryExam && yearMathExam) {
            return true
        } else {return false}
    }

    fun groupeTakesExam(): Int  {

        var numberStudents = numberOfStudentsInGroup
        var numberOfStudentsPassedExam = 0
        while (numberStudents > 0) {
            if (exam()) {
                numberOfStudentsPassedExam += 1
                println("exam for student # $numberStudents passed")
            } else {
                println("exam for student # $numberStudents failed")
            }
            println("number of student was examined $numberStudents")
            numberStudents = numberStudents - 1
        }

        return numberOfStudentsPassedExam
    }

}

