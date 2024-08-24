package com.qedir314.myfirstapp

open class Animal {
    open fun sound() {
        println("Animal sounded")
    }
}

class Dog: Animal() {

    fun bark() {
        println("Dog barked")
    }

    override fun sound() {
        println("Dog sounded")
    }
}