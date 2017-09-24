package io.zipcoder.interfaces.instructor_student_people.instructor_student_people.education;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.Student;

/**
 * Created by Chris on 9/23/2017.
 */
public interface Teacher {
    void teach(Student student, double numberOfHours);
    void lecture(Student[] students, double numberOfHours);
}
