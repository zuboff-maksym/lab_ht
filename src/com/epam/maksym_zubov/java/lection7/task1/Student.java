package com.epam.maksym_zubov.java.lection7.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String student;
    private String curriculum;
    private GregorianCalendar startDate;
    private ArrayList<Course> courses;


    public Student(String student, String curriculum) {
        this.student = student;
        this.curriculum = curriculum;
        this.courses = new ArrayList<Course>();
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public void addToCourses(Course course) {
        courses.add(course);
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public String studentEducationProcess() {
        int totalStudyHours = 0;
        int hoursAfterEndOfStudy;
        for(Course c : courses) {
            totalStudyHours = totalStudyHours + c.getDuration();
        }
        String outputFinished = student+" ("+curriculum+") - Study is finished. After study passed ";
        String outputNotFinished = student+" ("+curriculum+") - Study is not finished. Time to finish ";

        GregorianCalendar dateNow = new GregorianCalendar();
        int yearStartDay = startDate.get(Calendar.YEAR);
        int yearNow = dateNow.get(Calendar.YEAR);


        if (yearStartDay < yearNow) {
            hoursAfterEndOfStudy = (yearNow - yearStartDay) * 365 * 24 + (dateNow.get(Calendar.DAY_OF_YEAR)
                    - dateNow.get(Calendar.DAY_OF_YEAR)) * 24 - totalStudyHours;
            return outputFinished + String.valueOf(hoursAfterEndOfStudy / 24) + " d" + " "
                    + String.valueOf(hoursAfterEndOfStudy % 24) + " h";
        }

        if (yearStartDay == yearNow && (dateNow.get(Calendar.DAY_OF_YEAR) - startDate.get(Calendar.DAY_OF_YEAR))*5
        /7*8 > totalStudyHours) {
            hoursAfterEndOfStudy = (dateNow.get(Calendar.DAY_OF_YEAR)
                    - startDate.get(Calendar.DAY_OF_YEAR)) * 24 - totalStudyHours;
            return outputFinished + String.valueOf(hoursAfterEndOfStudy / 24) + " d" + " "
                    + String.valueOf(hoursAfterEndOfStudy % 24) + " h";
        }


        if (yearStartDay == yearNow && (dateNow.get(Calendar.DAY_OF_YEAR) - startDate.get(Calendar.DAY_OF_YEAR))*5
                /7*8 <= totalStudyHours) {
            int studyDays = 0;
            if (totalStudyHours%8 == 0) {
                studyDays = totalStudyHours/8;
            }
            if (totalStudyHours%8 != 0){
                studyDays = totalStudyHours/8 + 1;
            }

            int daysStudied = dateNow.get(Calendar.DAY_OF_YEAR) - startDate.get(Calendar.DAY_OF_YEAR);

            if (dateNow.get(Calendar.HOUR)>=10 && dateNow.get(Calendar.HOUR)<=18) {
                return outputNotFinished + String.valueOf((studyDays - daysStudied)*8 - (dateNow.get(Calendar.HOUR)-10)) +
                        " h.";
            } else if (dateNow.get(Calendar.HOUR)<10) {
                return outputNotFinished + String.valueOf((studyDays - daysStudied)*8) + " h.";
            } else if (dateNow.get(Calendar.HOUR)>18) {
                return outputNotFinished + String.valueOf((studyDays - daysStudied)*8 - 8) + " h.";
            }
        }
        return String.valueOf(totalStudyHours);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student='" + student + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", startDate=" + startDate +
                ", courses=" + courses +
                '}';
    }
}
