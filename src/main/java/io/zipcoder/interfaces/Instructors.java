package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor chris = new Instructor(988, "Chris");
        Instructor kris = new Instructor(987, "Kris");
        Instructor dolio = new Instructor(986, "Dolio");
        this.add(chris);
        this.add(kris);
        this.add(dolio);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] instructorArray = new Instructor[personList.size()];
        personList.toArray(instructorArray);
        return instructorArray;
    }
}

