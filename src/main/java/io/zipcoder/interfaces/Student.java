package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public class Student extends Person implements Learner {
    private double totalStudyTime;
    public Student(String name) {
        super(name, Students.getInstance().getCount());
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
