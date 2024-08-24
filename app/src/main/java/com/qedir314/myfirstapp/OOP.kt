package com.qedir314.myfirstapp

fun main() {
    val john = Musician("John", 22,"Piano")
    println(john.age)
    john.age = 27
    println(john.age)

    john.sing()

    // encapsulation

    val denny = Musician("Denny", 30, "Guitar")
    denny.sing()
    // denny.kind = "Bird"      // won't work, kind is protected
     denny.printKind()
    println(denny.eyeColor)

    // inheritance

    val hero = Hero("Superman", "Fly")
    hero.run()

    val greatHero = GreatHero("Batman", "Being rich")
    greatHero.run()
    greatHero.greatFunction()

    // Polymorphism

    // static Polymorphism
    val processes = Processes()
    println(processes.substraction(5,1))
    println(processes.substraction(5,1,1))
    println(processes.substraction(5,1,1,1))

    // dynamic Polymorphism
    val cat = Animal()
    val dog = Dog()

    val exampleArray = arrayOf(cat, dog)
    exampleArray.forEach {
        it.sound()
    }

    // Abstraction
    // Abstract class, interface

    // val human = Human()     // cannot create object from abstract class


}