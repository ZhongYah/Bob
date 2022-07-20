package com.yah.kotlin

import com.yah.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest(){
        val student = Student("Mi", 84, 63)
        Assertions.assertEquals(84 , student.highest())
    }

    @Test
    fun averageTest(){
        val student = Student("Mi", 84, 63)
        Assertions.assertEquals((84+63)/2 , student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("Mi", 84, 63)
        Assertions.assertEquals('C' , student.grading())
    }
}