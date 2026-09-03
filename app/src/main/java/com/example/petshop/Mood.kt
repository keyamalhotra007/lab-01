package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun getMood(): String

    fun printMood() {
        println("On $date, the mood was ${getMood()}")
    }
}