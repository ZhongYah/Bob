package com.yah

import java.util.Scanner

fun main(args: Array<String>) {
  //  userln()
    val stu = Student("Nian", 77, 20)
    stu.print()
    val test = 123
    println("Try is : $test")
    println("Hight score: ${stu.highest()}")
}

private fun userln() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    //var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()

}

class Student (var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(name + " " + english + "\t" + math + "\t" + getAverage() + "\t" +
                if (getAverage() >= 60)"PASS" else "FAILED")
    }
    fun getAverage() : Int {
        return (english + math) / 2
    }
    fun highest() : Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }

       /* if (english > math) {
            max = english
        } else {
            max = math
        }*/
        return max
    }

    fun nameCheck() {
        println(name?.length)
    }
}