package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    private Instructors() {
        String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
        for (String instructorName : instructorNames) {
            int id = getCount();
            Instructor instructor = new Instructor(instructorName, id);
            add(instructor);
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