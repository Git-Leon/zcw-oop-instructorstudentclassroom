package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public class Instructor extends Person implements Teacher {
    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    @Override
    public void lecture(Student[] students, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / students.length;
        for (Student student : students) {
            student.learn(numberOfHoursPerStudent);
        }
    }
}