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
        testHostLecture(Instructors.getInstance().getArray());
    }

    @Test
    public void testHostLectureEducators() {
        testHostLecture(Educator.values());
    }

    private void testHostLecture(Teacher[] teachers) {
        for (Teacher teacher : teachers) {
            testHostLecture(teacher);
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
