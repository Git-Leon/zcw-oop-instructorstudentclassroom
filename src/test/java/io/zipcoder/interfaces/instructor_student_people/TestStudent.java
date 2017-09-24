package io.zipcoder.interfaces.instructor_student_people;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.education.Learner;
import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Chris on 9/23/2017.
 */
public class TestStudent {
    private String studentName;
    private Student student;

    @Before
    public void setup() {
        this.studentName = "Leon";
        this.student = new Student(studentName, 0);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn() {
        //Given
        double expectedNumberOfHours = 10;
        double preStudyTime = student.getTotalStudyTime();

        // When
        student.learn(expectedNumberOfHours);
        double postStudyTime = student.getTotalStudyTime();

        // Then
        double actualNumberOfHours = postStudyTime - preStudyTime;
        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours, 0);

    }
}
