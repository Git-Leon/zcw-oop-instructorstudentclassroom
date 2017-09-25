package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public enum ZipCodeWilmington {
    INSTANCE;
    private static final Students cohort = Students.getInstance();
    private static final People instructors = Instructors.getInstance();

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture(cohort.getStudents(), numberOfHours);
    }

    public void hostLecture(Instructor instructor, double numberOfHours) {

    }

    public People getCohort() {
        return this.cohort;
    }
}
