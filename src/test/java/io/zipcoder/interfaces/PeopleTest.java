package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd() {
        // Given
        Students s = Students.getInstance();
        Student psn = new Student(1234, "Joey");
        Student psn2 = new Student(456, "Terri");

        // When
        s.add(psn);
        s.add(psn2);

        // Then
        Assert.assertTrue(s.contains(psn));
        Assert.assertTrue(s.contains(psn2));

        s.remove(psn);
        s.remove(psn2);
    }

    @Test
    public void testRemove() {
        // Given
        Students s = Students.getInstance();
        Student psn = new Student(1234, "Joey");
        Student psn2 = new Student(456, "Terri");
        s.add(psn);
        s.add(psn2);

        // When
        s.remove(psn);
        s.remove(psn2);

        // Then
        Assert.assertFalse(s.contains(psn));
        Assert.assertFalse(s.contains(psn2));
    }

    @Test
    public void testRemoveById() {
        // Given
        Students s = Students.getInstance();
        Student psn = new Student(1234, "Joey");
        Student psn2 = new Student(456, "Terri");
        s.add(psn);
        s.add(psn2);

        // When
        s.remove(psn.getId());
        s.remove(psn2.getId());

        // Then
        Assert.assertFalse(s.contains(psn));
        Assert.assertFalse(s.contains(psn2));
    }

    /*  // This test will mess up the other tests
    @Test
    public void testRemoveAll() {
        // Given
        Students s = Students.getInstance();
        Student psn = new Student(1234, "Joey");
        Student psn2 = new Student(456, "Terri");
        s.add(psn);
        s.add(psn2);

        // When
        s.removeAll();
        s.removeAll();

        // Then
        Assert.assertFalse(s.contains(psn));
        Assert.assertFalse(s.contains(psn2));
    }

     */

    @Test
    public void testCount() {
        // Given
        Students s = Students.getInstance();
        Integer expected = 4;

        // When
        Integer actual = s.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        // Given
        Students s = Students.getInstance();

        // When
        Person actualPsn = s.findById(123);
        Person actualPsn2 = s.findById(124);

        // Then
        Assert.assertEquals("Kelly", actualPsn.getName());
        Assert.assertEquals("Abiel", actualPsn2.getName());
    }

    @Test
    public void testToArray() {
        // Given
        Students s = Students.getInstance();
        int expected = 4;

        // When
        Student[] actual = s.toArray();

        // Then
        Assert.assertEquals(expected, actual.length);
    }

}

