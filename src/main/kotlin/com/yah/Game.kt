package com.yah

import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    //val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Please enter a number: ")
    //    number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number < secret) {
            println("higher")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Great,the number is $number")
        }
    }
}