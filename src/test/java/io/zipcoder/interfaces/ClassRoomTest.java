package io.zipcoder.interfaces;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class ClassRoomTest {
    ClassRoom classroom;

    @Before
    public void setUp(){
         classroom = new ClassRoom();
    }


    @Test
    public void TestClassRoom(){
        ArrayList<Person> rosterTest = new ArrayList<Person>();
        rosterTest.addAll(ZipCodeWilmington.getInstructors());
        rosterTest.addAll(TechConnect.getStudents());

        for(Person element: classroom.getRoster().values()){
            assertTrue(rosterTest.contains(element));
        }
    }
}