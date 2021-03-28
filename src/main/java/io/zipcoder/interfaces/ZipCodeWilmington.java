package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;

public final class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructorHostingLecture = instructors.findById(id);
        instructorHostingLecture.lecture(students.toArray(), numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap() {
        // Mapping from Student objects to Double objects (each students total study time)
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student current = itr.next();
            studyMap.put(current, current.getTotalStudyTime());
        }
        return studyMap;
    }
}
