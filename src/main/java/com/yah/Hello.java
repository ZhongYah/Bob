package com.yah;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello word");
      // new Person().hello();
        Person p = new Person("Bob",72f, 1.69f);
        p.hello();
        p.weight = 72f;
        p.height = 1.69f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';                     // A = 65
        System.out.println(c > 'a');      // a = 97

        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character C2 = 'A';
        byte b = 120;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/
    }
}
