package com.yah

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String, Car?>()
    var enter = LocalDateTime.of(2022, 12, 11, 8, 10, 5)
    var car:Car? = Car("AAA-0001", enter)
    parkingLot.put(car!!.id, car)
    car = Car("BBB-0002", enter.plusMinutes(15))
    parkingLot.put(car.id, car)
    // Car 1 Leaving
    var leave = LocalDateTime.of(2022, 12, 11, 9, 45, 19)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()} Total: $${(car?.duration())!!/(60.0)*(30)}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    // Car 2 Leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()} Total: $${(car?.duration())!!/(60.0)*(30)}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    /*val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(87, 14, 99, 45, 31)
    for (score in scores){
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)*/
}