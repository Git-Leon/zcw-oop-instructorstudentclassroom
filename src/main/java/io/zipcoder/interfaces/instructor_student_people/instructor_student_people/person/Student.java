package io.zipcoder.interfaces.instructor_student_people.instructor_student_people.person;

import io.zipcoder.interfaces.instructor_student_people.instructor_student_people.education.Learner;

/**
 * Created by Chris on 9/23/2017.
 */
public class Student extends Person implements Learner {
    private double totalStudyTime;
    public Student(String name, long id) {
        super(name, id);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
