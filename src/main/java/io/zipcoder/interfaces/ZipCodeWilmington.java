package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public enum ZipCodeWilmington {
    INSTANCE;
    private final MyCohort cohort = MyCohort.getInstance();
    private final People instructors = ZipCodeInstructors.getInstance();

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture(cohort.getStudents(), numberOfHours);
    }

    public People getCohort() {
        return this.cohort;
    }
}
