package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test() {
        // Given
        Instructors i = Instructors.getInstance();

        // When
        Person Chris = i.findById(988);
        Boolean Kris = i.contains(i.findById(987));
        Boolean Dolio = i.contains(i.findById(986));

        // Then
        Assert.assertTrue(Chris.getName() == "Chris");
        Assert.assertTrue(Kris);
        Assert.assertTrue(Dolio);
    }
}
