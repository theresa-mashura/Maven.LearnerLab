package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        // Given
        Students s = Students.getInstance();

        // When
        Boolean kelly = s.contains(s.findById(123));
        Boolean lena = s.contains(s.findById(124));
        Boolean abiel = s.contains(s.findById(125));
        Boolean greg = s.contains(s.findById(126));

        // Then
        Assert.assertTrue(kelly);
        Assert.assertTrue(lena);
        Assert.assertTrue(abiel);
        Assert.assertTrue(greg);
    }
}
