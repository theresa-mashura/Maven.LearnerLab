package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
        // Given
        Educator chris = Educator.CHRIS;

        // Then
        Assert.assertTrue(chris instanceof Educator);
    }

    @Test
    public void testInheritance() {
        // Given
        Educator chris = Educator.CHRIS;

        // Then
        Assert.assertTrue(chris instanceof Teacher);
    }

    @Test
    public void testAddToSingleton() {
        // Given
        Instructors i = Instructors.getInstance();

        // When
        Instructor chris = Educator.CHRIS.getInstructor();

        // Then
        Assert.assertTrue(i.contains(chris));
    }

    @Test
    public void testTeach() {
        // Given
        Educator chris = Educator.CHRIS;
        Students s = Students.getInstance();
        s.clearAllStudyHours();
        Student kelly = s.findById(123);

        // When
        chris.teach(kelly, 2);
        Double actual = kelly.getTotalStudyTime();

        // Then
        Assert.assertEquals((Double) 2.0, actual);
    }

    @Test
    public void testLecture() {
        // Given
        Educator chris = Educator.CHRIS;
        Students s = Students.getInstance();
        s.clearAllStudyHours();

        // When
        chris.lecture(s.toArray(), 2);
        Double actualKelly = s.findById(123).getTotalStudyTime();
        Double actualAbiel = s.findById(124).getTotalStudyTime();

        // Then
        Assert.assertEquals((Double) (2.0 / 4), actualKelly);
        Assert.assertEquals((Double) (2.0 / 4), actualAbiel);
    }

    @Test
    public void testTimeWorked() {
        // Given
        Educator chris = Educator.CHRIS;
        Students s = Students.getInstance();
        s.clearAllStudyHours();
        chris.clearTimeWorked();
        Student kelly = s.findById(123);

        // When
        chris.lecture(s.toArray(), 2);
        chris.teach(kelly, 1);
        double actual = chris.getTimeWorked();

        // Then
        Assert.assertEquals(3, actual, .00001);
    }
}
