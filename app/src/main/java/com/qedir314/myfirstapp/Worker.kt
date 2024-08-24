package com.qedir314.myfirstapp

class Worker(val name: String,
              private var salary: Int,
              var department: String,
              var age: Int) {

fun showSalary() {
    println("Salary: $salary")
}



}