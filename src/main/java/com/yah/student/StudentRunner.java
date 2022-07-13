package com.yah.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
       //userIntput();
        Student stu = new Student("Bob", 88 , 76 );
        stu.print();
        System.out.println("High scores:" + stu.highest());
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
