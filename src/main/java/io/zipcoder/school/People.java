package io.zipcoder.school;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Chris on 9/23/2017.
 */
 abstract public class People<E extends Person> implements Iterable<E> {
    protected final ArrayList<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public int getCount() {
        return personList.size();
    }

    abstract public E[] getArray();

    public void removeAll() {
        personList.clear();
    }

    public E findById(long personId) {
        for (E person : personList) {
            if (person.getId() == personId) {
                return person;
            }
        }
        String errorMessage = "Person with id '" + personId + "' was not found";
        throw new IllegalArgumentException(errorMessage);
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
