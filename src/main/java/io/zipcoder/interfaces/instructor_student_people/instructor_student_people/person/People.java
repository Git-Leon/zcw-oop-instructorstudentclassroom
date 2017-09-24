package io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person;

import java.util.ArrayList;

/**
 * Created by Chris on 9/23/2017.
 */
public class People {
    protected final ArrayList<Person> people = new ArrayList<>();
    private Object students;

    public void add(Person person) {
        people.add(person);
    }

    public int getCount() {
        return people.size();
    }

    public Person[] getArray() {
        return people.stream().toArray(Person[]::new);
    }

    public void removeAll() {
        people.clear();
    }

    public Person findById(long personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        String errorMessage = "Person with id " + personId + " was not found";
        throw new IllegalArgumentException(errorMessage);
    }


}
