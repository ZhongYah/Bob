package com.yah.parking;

import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuration(){
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }

    public void leave(){
        leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave){
        if(leave.isAfter(enter)){
            this.leave = leave;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

