package io.zipcoder.school;

/**
 * Created by Chris on 9/23/2017.
 */
public enum ZipCodeWilmington {
    INSTANCE;
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }
}