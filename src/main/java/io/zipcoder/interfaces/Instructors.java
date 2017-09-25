package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    private Instructors() {
        for (Educator educator : Educator.values()) {
            add(new Instructor(educator.name(), educator.ordinal()));
        }
    }

    public static Instructors getInstance() {
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
