package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    private Person person;
    private String expectedName;

    @Before
    public void setup() {
        // Given
        this.expectedName = "Leon";
        this.person = new Person(expectedName, 0);
    }

    @Test
    public void testGetName() {
        // When
        String actualName = this.person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //Given
        String expectedName = "Hunter";

        // When
        this.person.setName(expectedName);
        String actualName = this.person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
