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

    private double timeWorked;
    private final Instructor instructor;

    Educator() {
        Instructors instructors = Instructors.getInstance();
        Instructor instructor = getWorkingInstructor();
        instructors.add(instructor);
        this.instructor = instructors.findById(instructor.getId());
    }

    public Instructor asInstructor() {
        return instructor;
    }

    @Override
    public void teach(Learner student, double numberOfHours) {
        instructor.teach(student, numberOfHours);
    }

    @Override
    public void lecture(Learner[] students, double numberOfHours) {
        instructor.lecture(students, numberOfHours);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name = " + instructor.getName())
                .append("\nId = " + instructor.getId())
                .append("\nTime worked = " + timeWorked)
                .toString();
    }

    private Instructor getWorkingInstructor() {
        return new Instructor(name()) {
            @Override
            public void teach(Learner learner, double numberOfHours) {
                super.teach(learner, numberOfHours);
                Educator.this.timeWorked += numberOfHours;
            }
        };
    }
}