package com.qedir314.myfirstapp

var globalX = 30

fun main(){
    println(intOrNullFunction("23"))
    var str = "haha"
    println(intOrNullFunction(str))

    println(globalX)
    exampleFunction()
    exampleFunction2()

}

fun intOrNullFunction(str: String) : Int?{
    try {
        val number = str.toInt()
        return number
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

fun exampleFunction(){
    globalX = 20
    println(globalX)
}

fun exampleFunction2() {
    globalX = 30
    println(globalX)
}
