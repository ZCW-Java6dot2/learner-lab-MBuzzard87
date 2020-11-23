package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {
    Student student = new Student("Buzz");

    @Test
    public void testImplementation() {
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Double expectedTime = 4.0;
        student.learn(4);
        Double actualTime = student.getTotalStudyTime();

        assertEquals(expectedTime,actualTime);
    }

}
