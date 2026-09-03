package com.example.petshop

abstract class Pet(val name: String, var age: Int){
    abstract fun speak(): String // every kind of Pet must have a speak() function that returns a String
}