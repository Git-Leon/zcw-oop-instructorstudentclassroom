package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by leon on 9/25/17.
 */
public class TestZipCodeWilmington {

    @Test
    public void testHostLectureInstructor() {
        for(Instructor instructor : Instructors.getInstance().getArray()) {
            testHostLecture(instructor);
        }
    }

    @Test
    public void testHostLectureEducators() {
        for(Educator educator : Educator.values()) {
            testHostLecture(educator);
        }
    }

    private void testHostLecture(Teacher teacher) {
        // Given
        Students students = Students.getInstance();
        double numberOfStudents = students.getCount();
        double lectureSeed = ThreadLocalRandom.current().nextDouble();
        double lectureTime = lectureSeed * 100;

        // When
        HashMap<Student, Double> preStudyMap = students.getStudyMap();
        ZipCodeWilmington.INSTANCE.hostLecture(teacher, lectureTime);
        HashMap<Student, Double> postStudyMap = students.getStudyMap();

        // Then
        for (Student student : students.getArray()) {
            double preStudyTime = preStudyMap.get(student);
            double postStudyTime = postStudyMap.get(student);

            double actual = postStudyTime - preStudyTime;
            double expected = lectureTime / numberOfStudents;
            Assert.assertEquals(expected, actual, .00000000000001);
        }
    }

}
