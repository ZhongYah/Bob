package com.yah;

import com.yah.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestScoreTest(){
       Student student = new Student("Bob", 50, 84);
        Assertions.assertEquals(84 , student.highest());
    }

    @Test
    public void averageTest(){
        Student student = new Student("Bob", 50, 84);
        Assertions.assertEquals((50+84)/2 , student.getAverage());
    }
}
