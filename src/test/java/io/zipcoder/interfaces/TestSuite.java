package io.zipcoder.interfaces;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 9/25/17.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestInstructor.class,
        TestInstructors.class,
        TestPeople.class,
        TestPerson.class,
        TestStudent.class,
        TestStudents.class,
        TestZipCodeWilmington.class
})
public class TestSuite {
}
