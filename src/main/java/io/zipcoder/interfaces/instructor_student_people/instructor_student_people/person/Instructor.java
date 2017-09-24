package io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.education.Teacher;

/**
 * Created by Chris on 9/23/2017.
 */
public class Instructor extends Person implements Teacher {

    public Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] students, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / students.length;
        for(Student student : students) {
            student.learn(numberOfHoursPerStudent);
        }
    }
}
