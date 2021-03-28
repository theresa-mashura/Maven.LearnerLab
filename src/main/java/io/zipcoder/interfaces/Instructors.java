package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(988, "Chris"));
        this.add(new Instructor(987, "Kris"));
        this.add(new Instructor(986, "Dolio"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}

