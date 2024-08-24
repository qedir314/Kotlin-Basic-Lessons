package com.qedir314.myfirstapp

var count = 0

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