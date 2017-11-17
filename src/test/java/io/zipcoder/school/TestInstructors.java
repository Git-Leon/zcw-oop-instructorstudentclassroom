package io.zipcoder.school;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 9/25/17.
 */
public class TestInstructors {

    @Test
    public void testConstructor() {
        List<String> instructorNames = Arrays.asList("LEON", "TARIQ", "FROILAN", "DAVID", "ZACH", "IYASU", "DOLIO", "MIKAILA");
        for(Person person : Instructors.getInstance()) {
            Assert.assertTrue(instructorNames.contains(person.getName().toUpperCase()));
        }
    }


}
