package io.zipcoder.interfaces;

import java.util.HashMap;

/**
 * Created by Chris on 9/23/2017.
 */
public final class Students extends People<Student> {
    public static volatile Students INSTANCE = new Students();

    private Students() {
    }

    public static synchronized Students getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Students();

            String[] studentNames = {"Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                    "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                    "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                    "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                    "Cristine", "Brendan"};
            for (String studentName : studentNames) {
                INSTANCE.add(new Student(studentName));
            }
        }
        return INSTANCE;
    }

    public HashMap<Student, Double> getStudyMap() {
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>() {
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (Entry<Student, Double> entry : entrySet()) {
                    String name = entry.getKey().getName();
                    double studyTime = entry.getValue();
                    sb.append("\n\nName = " + name + "\nStudy time = " + studyTime);
                }
                return sb.toString();
            }
        };

        for (Student student : super.people) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

    @Override
    public Student[] getArray() {
        return super.people.stream().toArray(Student[]::new);
    }
}
