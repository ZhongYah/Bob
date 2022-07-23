package com.yah

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
     val enter: LocalDateTime = LocalDateTime.of(2022, 11,
             11, 8, 0, 0 )
     val leave: LocalDateTime = LocalDateTime.of(2022, 11,
             11, 10, 8 , 0)
     var car = Car("361-MBK", enter)
     car.leave = leave
     println(car.duration())
     val hours = Math.ceil(car.duration()/60.0).toLong()
     println(hours)
     println(hours*30)
}

class Car(val id:String, val enter: LocalDateTime){
    var leave: LocalDateTime? = null
        set(value){
            if (enter.isBefore(value))
                field = value //利用field代替this
        }
    fun duration() = Duration.between(enter, leave).toMinutes()
}
