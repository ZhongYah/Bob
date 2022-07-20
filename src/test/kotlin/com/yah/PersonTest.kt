package com.yah.kotlin

import com.yah.Human
import com.yah.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest(){
        val human = Human("Nian",55f, 1.63f)
        Assertions.assertEquals(55f/(1.63f*1.63f) , human.bmi())
    }

    @Test
    fun personBmiTest(){
        val person = Person(100.7f,1.87f)
        Assertions.assertEquals(100.7f/(1.87f*1.87f), person.bmi())
    }
}