package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        // Given
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students s = Students.getInstance();
        s.clearAllStudyHours();
        double expected = 10.0 / 4;

        // When
        zcw.hostLecture(988, 10);
        double actualKelly = s.findById(123).getTotalStudyTime();
        double actualAbiel = s.findById(124).getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actualKelly, .0001);
        Assert.assertEquals(expected, actualAbiel, .0001);
    }

    @Test
    public void testHostLectureTeacher() {
        // Given
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students s = Students.getInstance();
        s.clearAllStudyHours();
        Instructors i = Instructors.getInstance();
        double expected = 10.0 / 4;

        // When
        zcw.hostLecture(i.findById(986), 10);
        Student studentKelly = s.findById(123);
        Student studentAbiel = s.findById(124);
        double actualKelly = studentKelly.getTotalStudyTime();
        double actualAbiel = studentAbiel.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actualKelly, .0001);
        Assert.assertEquals(expected, actualAbiel, .0001);
    }

    @Test
    public void testStudyMap() {
        // Given
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students s = Students.getInstance();
        s.clearAllStudyHours();
        Student studentKelly = s.findById(123);
        Student studentAbiel = s.findById(124);
        Double expected = 10.0 / 4;

        // When
        zcw.hostLecture(988, 10);
        HashMap<Student, Double> actualMap = zcw.getStudyMap();

        // Then
        Assert.assertEquals(expected, actualMap.get(studentKelly));
        Assert.assertEquals(expected, actualMap.get(studentAbiel));
    }

}
