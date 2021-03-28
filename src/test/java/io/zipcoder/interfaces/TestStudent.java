package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        // When
        Student s = new Student(12345, "Theresa");

        // Then
        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance() {
        // When
        Student s = new Student(12345, "Theresa");

        // Then
        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void testLearn() {
        // Given
        Student s = new Student(12345, "Theresa");
        Double expected = 30.0;

        // When
        s.learn(10);
        s.learn(20);

        // Then
        Assert.assertEquals(expected, s.getTotalStudyTime());
    }
}
