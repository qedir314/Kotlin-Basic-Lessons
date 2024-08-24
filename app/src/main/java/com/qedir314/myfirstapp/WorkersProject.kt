package com.qedir314.myfirstapp

fun main() {

    val worker1 = Worker("Neymar", 100, "Gaming", 24)
    val worker2 = Worker("Ibra", 200, "Gaming", 37)
    val worker3 = Worker("Mahir Madatov", 150, "Finance", 20)
    val worker4 = Worker("Mahir Ay brat", 1200, "Finance", 16)
    val worker5 = Worker("Uzeyir", 280, "Singer", 21)
    val worker6 = Worker("Balaeli", 520, "Software", 39)
    val worker7 = Worker("Damla", 310, "Scientist", 24)
    val worker8 = Worker("Trump", 2500, "Scientist", 40)
    val worker9 = Worker("Elon Maska", 3000, "Software", 41)
    val worker10 = Worker("Samiraldo", 1, "Finance", 7)
    val workersList  = arrayListOf(worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10)

    val over30andSoftware = workersList.filter { it.age > 30 && it.department == "Software" }
    println("Salaries of workers, whose age over 30 and works in Software Department: ")
    over30andSoftware.forEach{
        it.showSalary()
    }

    val underThirtyNames = workersList.filter { it.age < 30 }.map { it.name }
    println("Names of Workers, Who are under 30: ")
    underThirtyNames.forEach { println(it) }
}