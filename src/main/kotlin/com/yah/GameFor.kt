package com.yah

import java.util.Random
import java.util.Scanner


fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..4){
        print("Please enter number(${i}/4): ")
        var number = scanner.nextInt()
        println("第${i}次 $number")
        if (number > secret){
            System.out.println("lower");
        }else if (number < secret){
            System.out.println("higher");
        }else {
            System.out.println("Great,the number is " + number);
            break;
        }
    }
}