package com.example.kotlinplayground

open class Transport(color: String, year: Int, model: String) {
    open fun beep() {
        println("BEEEP")
    }
}

class Car(engineVolume: Double,
          color: String,
          year: Int,
          model: String): Transport(color, year, model) {

    var speed: Int = 0
        private set

    fun accelerate(delta: Int) {
        super.beep()
        speed *= delta
        print("This is real acceleration now!")
    }

    fun decelerate(delta: Int) {
        if (speed - delta < 0) {
            speed = 0
            return
        }
        speed -= delta
    }

    override fun beep() {
        println("I AM THE CAR AND I AM BEEPING !!!")
    }
}