package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {


    @Test
    public void testConstructor() {
        Person person = new Person("Mike");
         String expectedName = "Mike";
         String actualName = person.getName();

         assertEquals(expectedName,actualName);
    }

    @Test
    public void testSetName() {
        Person person = new Person("");
        person.setName("Mike");
        String expectedName = "Mike";
        String actualName = person.getName();

        assertEquals(expectedName,actualName);
    }


}
