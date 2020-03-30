package com.example.kotlinplayground


class Student (
              private val name: String,
              private var startingYear: Int,
              private val nameOfTheSchool: String,
              private var avgGrade: Double) {
    ​
    var drinkBeer: Boolean = true
        private set
    ​
    fun startLearning() {
        drinkBeer = false
    }
    ​
    fun changeStartingYear(newYear: Int) {
        startingYear = newYear
    }
    ​
    fun studentData() {
        println(" University: $nameOfTheSchool student name: $name starting year: $startingYear average grade: $avgGrade")
    }
}