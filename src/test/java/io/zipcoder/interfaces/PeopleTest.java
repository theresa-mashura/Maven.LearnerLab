package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");

        // When
        p.add(psn);
        p.add(psn2);

        // Then
        Assert.assertTrue(p.contains(psn));
        Assert.assertTrue(p.contains(psn2));
    }

    @Test
    public void testRemove() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        p.add(psn);
        p.add(psn2);

        // When
        p.remove(psn);
        p.remove(psn2);

        // Then
        Assert.assertFalse(p.contains(psn));
        Assert.assertFalse(p.contains(psn2));
    }

    @Test
    public void testRemoveById() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        p.add(psn);
        p.add(psn2);

        // When
        p.remove(psn.getId());
        p.remove(psn2.getId());

        // Then
        Assert.assertFalse(p.contains(psn));
        Assert.assertFalse(p.contains(psn2));
    }

    @Test
    public void testRemoveAll() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        p.add(psn);
        p.add(psn2);

        // When
        p.removeAll();
        p.removeAll();

        // Then
        Assert.assertFalse(p.contains(psn));
        Assert.assertFalse(p.contains(psn2));
    }

    @Test
    public void testCount() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        Integer expected = 2;
        p.add(psn);
        p.add(psn2);

        // When
        Integer actual = p.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        p.add(psn);
        p.add(psn2);

        // When
        Person actualPsn = p.findById(psn.getId());
        Person actualPsn2 = p.findById(psn2.getId());

        // Then
        Assert.assertEquals(psn, actualPsn);
        Assert.assertEquals(psn2, actualPsn2);
    }

    @Test
    public void testToArray() {
        // Given
        People p = new People();
        Person psn = new Person(1234, "Joey");
        Person psn2 = new Person(456, "Terri");
        Person[] expected = {psn, psn2};
        p.add(psn);
        p.add(psn2);

        // When
        Person[] actual = p.toArray();

        // Then
        Assert.assertArrayEquals(expected, actual);
    }
}
