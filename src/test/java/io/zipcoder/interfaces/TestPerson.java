package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
        // Given
            Person p = new Person(12345, "Theresa");

        // When
        long actualId = p.getId();
        String actualName = p.getName();

        // Then
        Assert.assertEquals(12345, actualId);
        Assert.assertEquals("Theresa", actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        Person p = new Person(12345, "Theresa");

        // When
        p.setName("George");
        String actual = p.getName();

        // Then
        Assert.assertEquals("George", actual);
    }
}
