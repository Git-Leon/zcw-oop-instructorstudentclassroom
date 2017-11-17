package io.zipcoder.school;

/**
 * Created by Chris on 9/23/2017.
 */
public class Instructor extends Person implements Teacher {
    public Instructor(String name) {
        super(name, Instructors.getInstance().getCount());
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
