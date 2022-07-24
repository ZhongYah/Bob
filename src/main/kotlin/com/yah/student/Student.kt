package com.yah

import java.util.Scanner

fun main(args: Array<String>) {
  //  userln()
    Student.pass = 60  // 可覆蓋原本 pass
    val stu = Student("Nian", 34, 87)
    val stu1 = Student("Yunus", 54, 87)
    val stu2 = Student("Bobo", 13, 87)
    stu.print()
    stu1.print()
    stu2.print()
    val test = 123
    println("TEXT is : $test")
    println("Hight score: ${stu.highest()}")
    Student.test()
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
    companion object{
        @JvmStatic
        var pass = 70
        fun test(){
            println("testing")
        }
    }
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        /*print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                if (getAverage() >= 60)"PASS" else "FAILED")
        println("\t" + grading())*/
    }
    fun passOrFailed() = if (getAverage() >= pass)"PASS" else "FAILED"
    fun grading() /*: Char*/ = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
        /*var grading =*/
        /*return*/
        }
        //return grading

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
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


    fun nameCheck() = name?.length

}