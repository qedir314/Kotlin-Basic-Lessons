package com.qedir314.myfirstapp

class Musician(var name: String, var age: Int, var instrument: String) : Human(), Music, Dance {      // we can implement many interfaces

    private var kind = "Human"

    var eyeColor = "Blue"
        private set
        public get           // read only, not modify

    /*
    private eyeColor = "Blue"
    fun setEyeColor(newEyeColor: String) {
        this.eyeColor = newEyeColor
    }
    fun getEyeColor(){
        println(this.eyeColor)
    }
    */

    fun printKind() {
        println(this.kind)
    }

    fun sing(){
        println("${this.name} sings a song")
    }

    init {
        println("init is called")
    }

    override fun test() {
        // override version of abstract function from abstract class
    }

    override fun singingSongFunction() {

    }

    override fun danceFunction() {

    }


}