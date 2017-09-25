package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public class Instructor extends Person implements Teacher {
    private final Teacher teacher;

    public Instructor(Educator educator) {
        super(educator.name(), educator.ordinal());
        this.teacher = educator;
    }

    @Override
    public void teach(Student student, double numberOfHours) {
        teacher.teach(student, numberOfHours);

    }

    @Override
    public void lecture(Student[] students, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }
}