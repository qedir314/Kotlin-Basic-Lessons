package com.qedir314.myfirstapp

open class Hero(var name: String, var power: String) {

    fun run(){
        println("${this.name} runs")
    }
}

class GreatHero(name: String, power: String): Hero(name, power) {
    fun greatFunction(){

    }
}