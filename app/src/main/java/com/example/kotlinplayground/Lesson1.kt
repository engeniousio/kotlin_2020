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

    println("======SESSION 2 ===========")
    testArrays()
    println("=======CLASSES========")
    testClasses()
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

fun testArrays() {

    val numbers: IntArray = intArrayOf(7, -10, 5, 24, 33, 19)

    println(numbers[3])
    println(numbers.size)
    println(numbers[numbers.size - 1])
    println(numbers.lastIndex)

    println("================")

    for (i in numbers) {
        println(i)
    }

    println("------------")

    println(sumArray(numbers))

    val namesAndAges = mapOf("John" to 30, "Ben" to 25, "Igor" to 32)

    println(namesAndAges["John"])

}

// write a function that takes an array of integers as an argument and returns the sum of all elements

fun sumArray(numbers: IntArray): Int {

    var sum: Int = 0

    for (i in numbers) {
        sum = sum + i
    }
    return sum
}

fun testClasses() {
    val audiCar = Car(4.6,"black", 2020, "audi")
    var lambo = Car(6.4,"yellow", 2019, "lamborghini")

    audiCar.beep()

    lambo.accelerate(5)
    lambo.accelerate(15)
    lambo.decelerate(25)
    println("Lambo speed: ${lambo.speed}")

//    audiCar.speed = 300   ---  Error
}