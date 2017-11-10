package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return super.people.stream().toArray(Instructor[]::new);
    }
}
