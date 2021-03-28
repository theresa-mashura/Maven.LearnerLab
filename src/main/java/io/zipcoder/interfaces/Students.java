package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(123, "Kelly"));
        this.add(new Student(124, "Abiel"));
        this.add(new Student(125, "Lena"));
        this.add(new Student(126, "Greg"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
