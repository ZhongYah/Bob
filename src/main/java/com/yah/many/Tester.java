package com.yah.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(list.size());
        List<Integer> scores =
                Arrays.asList(87, 14, 99, 45, 31);
        for (int score: scores){
            System.out.println(score);
        }
//        arrayTest();
    }

    private static void arrayTest() {
        int[]numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 8;
//        numbers[5] = 3;
        int[] scores = {87, 14, 99, 45, 31};
        System.out.println(scores);
        for (int i=0; i<5; i++){
            System.out.println(scores[i]);
        }
        for (int n : scores){
            System.out.println(n);
        }
    }
}
