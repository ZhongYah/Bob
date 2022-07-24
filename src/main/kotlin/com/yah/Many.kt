package com.yah

fun main(args: Array<String>) {
    val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(87, 14, 99, 45, 31)
    for (score in scores){
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}