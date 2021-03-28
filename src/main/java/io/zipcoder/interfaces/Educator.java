package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    CHRIS(988, "Chris"),
    KRIS(987, "Kris"),
    DOLIO(986, "Dolio") ;

    private final Instructor instructor;
    private double timeWorked;

    private Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(this.instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }
}
