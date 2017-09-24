package io.zipcoder.interfaces.instructor_student_people.instructor_student_people;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.Instructor;
import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.People;
import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person.Person;

/**
 * Created by Chris on 9/23/2017.
 */
public final class ZipCodeInstructors extends People {
    private static final ZipCodeInstructors INSTANCE = new ZipCodeInstructors();
    private ZipCodeInstructors() {
        String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
        for (String instructorName : instructorNames) {
            int id = getCount();
            Instructor instructor = new Instructor(instructorName, id);
            add(instructor);
        }
    }

    public static ZipCodeInstructors getInstance() {
        return INSTANCE;
    }


    // TODO - Replace with generic inheritance to prevent odd casting issues of subclasses
    public Instructor[] getInstructors() {
        int numberOfInstructors = getCount();
        Instructor[] instructors = new Instructor[numberOfInstructors];
        for(int i=0; i<people.size(); i++) {
            Person currentPerson = people.get(i);
            instructors[i] = (Instructor) currentPerson;
        }
        return instructors;
    }
}
