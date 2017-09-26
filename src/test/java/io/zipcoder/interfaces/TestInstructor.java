package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Chris on 9/23/2017.
 */
public class TestInstructor {
    private Instructor instructor;

    @Before
    public void setup() {
        this.instructor = Educator.LEON.asInstructor();
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach() {
        //Given
        Student dummyStudent = new Student("I am a dummy", 0);
        double preStudyTime = dummyStudent.getTotalStudyTime();
        double expectedStudyTime = 10;

        // When
        instructor.teach(dummyStudent, expectedStudyTime);
        double postStudyTime = dummyStudent.getTotalStudyTime();
        double actualStudyTime = postStudyTime - preStudyTime;

        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }

}
