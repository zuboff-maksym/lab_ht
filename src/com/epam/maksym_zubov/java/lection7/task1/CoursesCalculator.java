package com.epam.maksym_zubov.java.lection7.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CoursesCalculator {
    public static void main(String[] args) {
        Student ivan = new Student("Ivanov Ivan", "J2EE Developer");
        GregorianCalendar date = new GregorianCalendar(2022, 00, 22);
        ivan.setStartDate(date);

        Course javaServlets = new Course("Технология Java Servlets", 16);
        Course strutsFramework = new Course("Struts Framework", 24);
        ivan.addToCourses(javaServlets);
        ivan.addToCourses(strutsFramework);

        Student petr = new Student("Petrov Petr", "Java Developer");
        GregorianCalendar date1 = new GregorianCalendar(2022, 01, 21);
        petr.setStartDate(date1);
        Course javaTechnologies = new Course("Обзор технологий Java", 8);
        Course libraryJfc = new Course("Библиотека JFC/Swin", 16);
        Course techologyJdbc = new Course("Технология JDBC", 16);
        petr.addToCourses(javaTechnologies);
        petr.addToCourses(libraryJfc);
        petr.addToCourses(techologyJdbc);

        System.out.println(ivan.studentEducationProcess());
        System.out.println(petr.studentEducationProcess());

    }
}
