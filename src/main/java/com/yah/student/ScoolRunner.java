package com.yah.student;

import java.util.Scanner;


public class ScoolRunner {
    public static void main(String[] args) {
       //userIntput();
        com.yah.Student.getPass();  // 引用kotlin的 var pass = 70
//        Student.pass = 50;
        Student stu = new Student("Bob", 88 , 75);
        Student stu2 = new Student("Tom", 60, 40);
        Student stu3 = new Student("Mi", 30, 55);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High scores: " + stu.highest());
    }

    private static void userIntput() {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        Student stu = new Student(name, english , math );
        stu.print();
        System.out.println("High scores: " + stu.highest());
    }
}


