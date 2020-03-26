package com.example.kotlinplayground

fun main() {

    val myInteger: Int = 23
    var varInteger: Int = 23
    varInteger = 100
    // myInteger = 100 -- error

    val myChar: Char = 's'
    var myString = "Hello, world!"

    // myString = 3 -- error


    val double: Double = 25.5

    val name = "Boris"

    println("Hello, $name $myChar ! ${2+2}")

    val myAge = 30

    if (myAge > 20) {
        println("$name is older than 20 years old")
    } else if (myAge > 10) {
        println("$name is older than 10 years old")
    } else {
        println("default case")
    }

    val myBoolean: Boolean = false

    if (myAge > 30 && myBoolean) {
        println("&& condition is true")
    } else {
        println("&& condition is false")
    }

    // x && y   ==> true if both are true
    // x || y   ==> false if both are false


    if (myAge == 30 || !myBoolean) {
        println("TRUE CONDITION")
    } else {
        println("FALSE CONDITION")
    }

    if (myAge > 20 && myAge < 60 && !myBoolean && (myAge * 2 < 100)) {
        println("TRUE CONDITION")
    } else {
        println("FALSE CONDITION")
    }

    val sum = 5 + 15
    val sub = 15 - 5
    val mult = 3 * 5
    val dev = 15 / 3

    val mod = 38 % 10

    println("Mod = $mod")

    val helloWorldString = "Hello, World!"

    println("Length of hello string = ${helloWorldString.length}")
    println(helloWorldString.subSequence(1, 3))

    myFirstFunction()
    greet("Boris")
    greet("Igor")

    val greetResult = greet("Boris", 25)
    println(greetResult)

    val sumOfIntegers = sum(10, -50)
    println("Sum of two integers is $sumOfIntegers")
}

fun myFirstFunction() {
    println("I am dummy function!")
}

fun greet(name: String) {
    println("Hello, $name!")
}

fun greet(name: String, age: Int): String {
  return "I am $name and I am $age years old"
}


// write a function that takes two integers and returns its sum

fun sum(firstInteger: Int, secondInteger: Int): Int {
    return firstInteger + secondInteger
}