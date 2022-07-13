package com.yah

import javafx.scene.text.FontWeight

fun main(args: Array<String>) {
    var s:String?= "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
//    println("Hello kotlin")
    val h = Human(weight = 72f, height = 1.69f )
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c :Char = 'A'
    println(c.toInt()>60)
  /*  var age = 19
    age = 20
    var weight = 66.5f
    var name : String
    name = "Hank"
*/
}

class Human(var name: String = "",var weight: Float, var height:Float) {
    init {
        println("test $weight" )
    }
    //constructor(name:String,weight: Float,height: Float):this(weight，height)
    fun  bmi():Float{
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")
    }

}