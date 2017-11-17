package io.zipcoder.school;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chris on 9/23/2017.
 */
public class TestPeople {
    private People<Person> people = new People<Person>() {
        @Override
        public Person[] getArray() {
            return this.personList.stream().toArray(Person[]::new);
        }
    };


    @Test
    public void testAdd() {
        // Given
        Student expected = new Student("I am a dummy");

        // When
        this.people.add(expected);
        Person actual = this.people.findById(expected.getId());

        // Then
        Assert.assertEquals(expected, actual);
    }
}
