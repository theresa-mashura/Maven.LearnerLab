package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student kelly = new Student(123, "Kelly");
        Student abiel = new Student(124, "Abiel");
        Student lena = new Student(125, "Lena");
        Student greg = new Student(126, "Greg");

        this.add(kelly);
        this.add(abiel);
        this.add(lena);
        this.add(greg);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] toArray() {
        Student[] studentArray = new Student[personList.size()];
        personList.toArray(studentArray);
        return studentArray;
    }

    public void clearAllStudyHours() {
        Iterator<Student> itr = personList.iterator();
        while(itr.hasNext()) {
            Student student = itr.next();
            student.clearTotalStudyTime();
        }
    }
}
