package io.zipcoder.interfaces.instructor_student_people.instructor_student_people;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.Person;

/**
 * Created by Chris on 9/24/2017.
 */
public enum Instructors {
    LEON,
    TARIQ,
    ZACH,
    FROILAN,
    IYASU,
    MIKAILA,
    DOLIO;

    private final Person person;

    Instructors() {
        this.person = new Person(name(), ordinal());
    }
}
