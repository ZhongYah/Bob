package com.yah.student.kotlin

fun main(args: Array<String>) {
    val stu = Student("Bob", 70, 88)
    stu.print()
}

class Student (var name: String, var english: Int, var math: Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" +
                (english+math)/2)
    }
}

