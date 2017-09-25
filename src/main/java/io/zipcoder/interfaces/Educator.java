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
    private final Instructor instructor;

    Educator() {
        this.instructor = new Instructor(name(), ordinal());
    }

    @Override
    public void teach(Student student, double numberOfHours) {
        instructor.teach(student, numberOfHours);
    }

    @Override
    public void lecture(Student[] students, double numberOfHours) {
        instructor.lecture(students, numberOfHours);
    }
}
