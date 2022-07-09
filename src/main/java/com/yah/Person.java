package com.yah;

public class Person {
    String name;
    float weight;
    float height;
    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name,float weight, float height) {
        this(weight, height); //呼叫上一個建構子，須寫在第一行
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello word");
    }
}

