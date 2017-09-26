package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Educators extends People<Instructor> {
    private static final Educators INSTANCE = new Educators();

    private Educators() {
    }

    public static Educators getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return people.stream().toArray(Instructor[]::new);
    }
}
