package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public interface Teacher {
    void teach(Student student, double numberOfHours);
    void lecture(Student[] students, double numberOfHours);
}
