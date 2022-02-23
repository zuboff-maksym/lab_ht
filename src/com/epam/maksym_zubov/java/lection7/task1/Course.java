package com.epam.maksym_zubov.java.lection7.task1;

public class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
