package io.zipcoder.school;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

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
        Student dummyStudent = new Student("I am a dummy");
        double preStudyTime = dummyStudent.getTotalStudyTime();
        double expectedStudyTime = 10;

        // When
        instructor.teach(dummyStudent, expectedStudyTime);
        double postStudyTime = dummyStudent.getTotalStudyTime();
        double actualStudyTime = postStudyTime - preStudyTime;

        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }

    @Test
    public void testLecture() {
        // Given
        Students students = Students.getInstance();
        double numberOfStudents = students.getCount();
        double lectureSeed = ThreadLocalRandom.current().nextDouble();
        double lectureTime = lectureSeed * 100;

        // When
        HashMap<Student, Double> preStudyMap = students.getStudyMap();
        ZipCodeWilmington.INSTANCE.hostLecture(instructor, lectureTime);
        HashMap<Student, Double> postStudyMap = students.getStudyMap();

        // Then
        for (Student student : students) {
            double preStudyTime = preStudyMap.get(student);
            double postStudyTime = postStudyMap.get(student);

            double actual = postStudyTime - preStudyTime;
            double expected = lectureTime / numberOfStudents;
            Assert.assertEquals(expected, actual, .00000000000001);
        }
    }

}
