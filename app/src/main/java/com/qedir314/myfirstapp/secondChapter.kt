package com.qedir314.myfirstapp

var count = 0
lateinit var myHero: Superhero

fun main() {
    println("Classes and Functions")

    firstFunction()
    firstFunction()
    secondFunction()

    substraction(1,101)
    adding(2,3)
    var result: Any = substraction(2,3)
    println(result)
    result = adding(2,3)
    println(result)

    val superman = Superhero("Clark Kent", 20 ,"Journalist")
    println(superman.age)

    // nullability
    val userInput = "haha"
    val userInputInt = userInput.toIntOrNull()

    if (userInputInt != null) {
        println(userInputInt * 10)
    }

    var myDouble : Double? = null
    val userInputDouble = userInput.toDoubleOrNull()

    // !!         100% sure
    // userInputDouble!!.div(2)      // division by 2   too risky

    // ?          safe call
    userInputDouble?.div(2)       // null or double; app won't crash

    if (userInputDouble != null) {
        println(userInputDouble / 2)
    }

    // elvis operator
    println(userInputDouble?.div(2) ?: 50)

    userInputDouble?.let {
        println(it * 2)        // if variable is not null, it'll execute
    }

    myHero = Superhero("Jonas", 21 ,"Programmer")

    testFunction()

}

fun testFunction() {
    println(myHero.age)
}

fun firstFunction() {
    count++
    println("$count times First Function Executed")
}

fun secondFunction() {
    println("Second Function Executed")
}

// input
fun substraction(a: Int, b: Int) {
    println("result: ${a-b}")
}

// output, return

fun adding(a: Int, b: Int) : Int {
    println("result: ${a+b}")
    return a + b
}