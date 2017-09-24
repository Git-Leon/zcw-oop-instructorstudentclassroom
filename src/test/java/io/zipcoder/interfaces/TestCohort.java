package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Chris on 9/23/2017.
 */
public class TestCohort {
    private People cohort;

    @Before
    public void setup() {
        this.cohort = new People();
    }

    @Test
    public void testAddStudent() {
        // Given
        long studentId = 0;
        Student expected = new Student("I am a dummy", studentId);

        // When
        this.cohort.add(expected);
        Student actual = this.cohort.findById(studentId);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
