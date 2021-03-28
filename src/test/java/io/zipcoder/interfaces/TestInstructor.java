package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        // When
        Instructor i = new Instructor(12345, "Theresa");

        // Then
        Assert.assertTrue(i instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        // When
        Instructor i = new Instructor(12345, "Theresa");

        // Then
        Assert.assertTrue(i instanceof Person);
    }

    @Test
    public void testTeach() {
        // Given
        Instructor i = new Instructor(12345, "Theresa");
        Student s = new Student(4567, "Eric");
        double expected = 3;

        // When
        i.teach(s, expected);
        double actual = s.getTotalStudyTime();

        // Then
        Assert.assertEquals(actual, expected, .001);
    }

    @Test
    public void testLecture() {
        // Given
        Instructor i = new Instructor(12345, "Theresa");
        Student s = new Student(4567, "Eric");
        Learner[] l = {new Student(3456, "Jerry"), new Student (8766, "Aaron"), new Student(987, "Eric")};
        double numberOfHours = 10;
        double expected = 10.0 / 3.0;

        // When
        i.lecture(l, numberOfHours);
        double actualStudent1 = l[0].getTotalStudyTime();
        double actualStudent2 = l[1].getTotalStudyTime();
        double actualStudent3 = l[2].getTotalStudyTime();

        // Then
        Assert.assertEquals(actualStudent1, expected, .001);
        Assert.assertEquals(actualStudent2, expected, .001);
        Assert.assertEquals(actualStudent3, expected, .001);
    }
}
