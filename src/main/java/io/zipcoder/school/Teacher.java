package io.zipcoder.school;

/**
 * Created by Chris on 9/23/2017.
 */
public interface Teacher {
    void teach(Learner student, double numberOfHours);
    void lecture(Learner[] students, double numberOfHours);
}
