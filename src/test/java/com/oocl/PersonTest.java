package com.oocl;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testPersonIntroduce() {
        Person person = new Person();
        person.setAge(21);
        person.setName("Tom");

        String expectedText = "My name is Tom. I am 21 years old.";
        assertEquals(expectedText, person.introduce());
    }
}