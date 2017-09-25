package io.zipcoder.interfaces;

/**
 * Created by leon on 9/25/17.
 */
public enum Educator implements Teacher {
    LEON,
    TARIQ,
    FROILAN,
    DAVID,
    ZACH,
    IYASU,
    DOLIO,
    MIKAILA;

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
