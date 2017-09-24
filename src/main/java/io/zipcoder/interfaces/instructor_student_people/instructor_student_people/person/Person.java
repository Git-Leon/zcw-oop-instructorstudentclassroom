package io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person;

public class Person {
    private String name;
    protected final long id;
    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
