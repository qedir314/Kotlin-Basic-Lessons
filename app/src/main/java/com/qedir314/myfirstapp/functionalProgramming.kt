package com.qedir314.myfirstapp

fun main() {
    println("------------Lambda---------")
    writeText("Hello")

    val writeTextLambda = {inputString: String -> println(inputString)}
    writeTextLambda("write test")

    val multiplicationLambda = {a: Int, b: Int -> a * b}
    val result = multiplicationLambda(5,10)
    println(result)

    val multiplicationSecond : (Int, Int) -> Int = {a,b -> a*b}
    println(multiplicationSecond(2,3))

    println("------------High order functions-------------")

    // filter
    val myList = arrayListOf(1,3,5,7,9,11,13,15,17,19)

    val smallList = myList.filter { num -> num % 3 == 0 && num < 10 }

    println(smallList)

    // smallList = myList.filter { it % 3 == 0 && it < 10 }

    // Map

    val myList2 = arrayListOf(1,3,5,7,9,11,13,15,17,19)

    val squaredList = myList2.map {it * it}
    println(squaredList)

    val mapFilterMix = myList2.filter { it < 10 }.map { it * it }
    println(mapFilterMix)

    val musician1 = Musician2("One", 21, "Guitar")
    val musician2 = Musician2("Two", 10, "Piaono")
    val musician3 = Musician2("Three", 35, "Guitar")
    val musicians = arrayListOf<Musician2>(musician1, musician2, musician3)

    val overThirtyMusiciansEnstruments = musicians.filter { it.age > 30 }.map { it.enstrument }
    println(overThirtyMusiciansEnstruments)

    val underThirtyMusiciansNames = musicians.filter { it.age < 30 }.map { it.name }
    println(underThirtyMusiciansNames)


    // Scope Functions
    println("---------Scope Functions----------")

    // let
    var myInteger: Int? = null
    myInteger?.let { println(it) }

    myInteger = 4
    val newInteger = myInteger?.let { it + 1 } ?: 0         // if myInteger null newInteger becomes zero, else it becomes myInteger++

    println(newInteger)

    // also

    musicians.filter { it.age < 25 }.also { it.forEach { println(it.name) } }



}

fun writeText(string: String) {
    println(string)
}