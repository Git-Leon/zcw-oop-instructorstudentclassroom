package io.zipcoder.interfaces;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                "Cristine",  "Brendan" };
        for (String studentName : studentNames) {
            int id = getCount();
            Student student = new Student(studentName, id);
            add(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    // TODO - Replace with generic inheritance to prevent odd casting issues of subclasses
    public Student[] getStudents() {
        int numberOfStudents = getCount();
        Student[] students = new Student[numberOfStudents];
        for(int i=0; i<people.size(); i++) {
            Person currentPerson = people.get(i);
            students[i] = (Student) currentPerson;
        }
        return students;
    }

}
