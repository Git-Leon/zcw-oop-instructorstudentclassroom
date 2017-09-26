package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Chris on 9/23/2017.
 */
public class TestPeople {
    private People people;

    @Before
    public void setup() {
        this.people = new People() {
            @Override
            public Person[] getArray() {
                return new Person[this.people.size()];
            }
        };
    }

    @Test
    public void testAdd() {
        // Given
        long studentId = 0;
        Student expected = new Student("I am a dummy", studentId);

        // When
        this.people.add(expected);
        Person actual = this.people.findById(studentId);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
