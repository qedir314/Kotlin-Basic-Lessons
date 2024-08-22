package com.qedir314.myfirstapp

fun main() {
    println("Hello World")
    println("Second line")
    // That's a comment
    println(5 * 2)
    println(10 / 2)
    println(5 / 2)
    // Variables and Constants

    // Integers
    println("--------INTEGER---------")

    // implicit
    var x = 30
    println(x)
    println(x * 20)

    x = 50
    println(x)
    println(x * 20)

    val y = 5
    println(y)
    println(x + y)

    val z = 20
    println(z)
    // z = 10  // can't run

    //explicit
    val exampleByte: Byte = 5
    val exampleShort: Short = 23
    val exampleInt: Int = 233
    val exampleLong: Long = 20
    println(exampleInt * exampleShort)

    //exampleByte = 1000   // impossible

    // snake_case
    // camelCase

    val m = 5
    val n = 23
    val result = m + n
    println(result)

    // Double - Float
    println("------Double - Float-----------")
    val pi = 3.14
    println(2 * pi)

    println(5 / 2)
    println(5.0 / 2.0)

    val exampleDouble: Double = 3.0
    val resultDouble = exampleDouble * pi
    println(resultDouble)

    val exampleFloat: Float = 2.5f
    println(exampleFloat * 2)

    // Unsigned Integers

    val unsignedByte: UByte = 10u
    val unsignedShort: UShort = 10u
    val unsignedInt: UInt = 10u
    val unsignedLong: ULong = 10u

    // Strings
    println("---------Strings---------")

    val myText = "My String"
    println(myText)

    val anotherString: String = "New String"

    val name = "Jonas"
    println(name.uppercase())

    val surname = "Kahnwald"
    println(name + " " + surname)

    val age1= "24"
    val age2 = "20"
    println(age1 + age2)

    val myString: String      // Not Initialized
    myString = "New String"   // Initialized

    // Conversion

    val age3 = "10"
    println(age3.toInt() * 2)

    val xLong = x.toLong()
    println(xLong)

    // Booleans
    println("---------Booleans--------")

    var myBool: Boolean = true
    myBool = false

    println(myBool)

    println(4 > 7)
    println(4 < 7)
    println(4 == 5)

    val userAge = "26"
    println(userAge.toInt() > 18)

    //    ||  or   && and

    println(4 > 5 && 5 > 3)
    println(4 > 3 || 5 > 8)

    // Data Structures

    // Array
    println("--------Array------")

    val myArray = arrayOf("Jonas", "Kahnwald", "Martha", "Nielsen")






}