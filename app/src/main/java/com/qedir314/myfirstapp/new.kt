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

    // array
    println("--------array-------")
    val newCharacter = "Ulrich"
    val newArray = arrayOf( newCharacter,"Jonas", "Kahnwald", "Martha", "Nielsen", "Noah")

    println(newArray[0])
    println(newArray[5])
    println(newArray.last())

    newArray[4] = "Kahnwald"
    println(newArray[4])
    println(newArray.get(1))

    println(newArray.size)
    // println(newArray.get(20))  out of bounds

    // newArray[6] = "new Character"    // out of bounds
    // println(newArray[6])

    // adding or removing array element is IMPOSSIBLE!

    val numArray = arrayOf(1,3,5,10,12)
    println(numArray[2] * 10)

    val mixArray = arrayOf(20, 2.71, "Paris", 'A')
    println(mixArray[2])

    // ArrayList
    println("------ArrayList-------")

    val nameList = arrayListOf("Jonas", "Kahnwald", "Martha", "Nielsen", "Noah")
    println(nameList[2])
    println(nameList.size)
    println(nameList[nameList.size - 1])

    nameList.add("Agnes")
    println(nameList[nameList.size - 1])

    nameList[5] = "Claudia"
    println(nameList.get(5))

    // nameList.remove("Noah")

    // nameList.removeAt(2)

    val numList1 = arrayListOf<Int>()
    val numList2 = ArrayList<Int>()

    numList1.add(50)
    numList2.add(20)
    println(numList1[0] * numList2[0])

    val newEmptyList = arrayListOf<Any>()
    newEmptyList.add(true)
    newEmptyList.add(2.71)
    newEmptyList.add("Bilbao")

    println(newEmptyList[2])

    // set
    println("---------Set----------")

    val exampleArray = arrayOf(10,10)
    println(exampleArray[0])
    println(exampleArray[1])

    val exampleSet = setOf(10,10,10,30,30,40)
    println(exampleSet.size)
    // exampleSet.add(20)        // isn't working
    // println(exampleSet[0])    // isn't working, unordered

    exampleSet.forEach {
        println(it)
    }

    val emptySet = HashSet<String>()
    emptySet.add("Madrid")
    emptySet.add("Madrid")
    emptySet.add("Madrid")
    emptySet.add("Mallorca")
    emptySet.add("Mallorca")
    emptySet.add("Tenerife")

    emptySet.forEach {
        println(it)
    }

    val newNumArray = arrayOf(1,1,1,2,2,3,5,5,6)
    val newNumSet = newNumArray.toHashSet()
    newNumSet.forEach {
        println(it)
    }

    // Map -----  key-value
    println("---------Map------")

    val fruitList = listOf("Apple", "Pear", "Melon")
    val caloriList = listOf(100,140,70)
    println("${fruitList[0]}'s calori is ${caloriList[0]}")

    val fruitCaloriMap = hashMapOf<String, Int>()
    fruitCaloriMap.put("Apple", 100)
    fruitCaloriMap["Pear"] = 140
    fruitCaloriMap["Melon"] = 70

    println("${fruitCaloriMap["Apple"]} or ${fruitCaloriMap.get("Apple")}")

    // fruitCaloriMap.remove("Apple")
    fruitCaloriMap.put("Apple", 20)
    println(fruitCaloriMap["Apple"])

    val exampleHashMap = hashMapOf<String, String>()
    exampleHashMap.put("Spain", "Madrid")
    println("${exampleHashMap["Spain"]}")


    // Control - Flow

    // if statements
    println("--------------if------------")

    var num = 10
    num = num + 1
    println(num)
    num++
    println(num)
    --num
    println(num)

    println(10 % 3)    // remainder

    val score = 12

    if (score < 10) {
        println("You failed!")
    }else if (score < 30) {
        println("Nice")
    }else if (score < 50) {
        println("Great")
    }else {
        println("Excellent")
    }


    // when
    println("---------when--------")

    val gradeInt = 4
    var gradeString = ""

    when(gradeInt) {
        0 -> gradeString = "worst"
        1 -> gradeString = "worse"
        2 -> gradeString = "bad"
        3 -> gradeString = "good"
        4 -> gradeString = "better"
        5 -> gradeString = "best"
        else -> gradeString = "unknown"
    }

    println(gradeString)

    // While loop
    println("----------while loop-------")

    var j = 0
    println("Loop begins")
    while (j < 10) {
        println(j)
        j++
    }
    println("Loop finishes")
    println(j)

    // for loop
    println("----------for loop-----------")

    var numberList = arrayListOf(5,10,15,20)

    println("Loop begins")
    for (number in numberList) {
        println(number / 5 * 3)
    }
    println("Loop finished")

    // range
    for (number in 0..9) {
        println(number * 10)
    }

    val myNewStringList = arrayListOf<String>()
    myNewStringList.add("miami")
    myNewStringList.add("dortmund")

    for (city in myNewStringList) {
        println(city.uppercase())
    }

    myNewStringList.forEach {  city ->       // default is " it "
        println(city.uppercase())
    }


}