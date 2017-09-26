package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public class Instructor extends Person implements Teacher {

    public Instructor(String name, int ordinal) {
        super(name, ordinal);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }
}
