/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import Course.Course;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import studentsInfo.Student;

/**
 *
 * @author Omkar
 */
public class SeatAssignment {

  
    double gpa;
    int rating;
    Random r;
    String course1, course2;
    Course c;
    int q = 0, p = 0;
    private Student student;
    private double grade;
    private Rating facultyRating;

    public SeatAssignment() {
       
        r = new Random();
        c = new Course();
        course1 = course1();
        course2 = course2();
    }
        public SeatAssignment(Student student, double grade, Rating facultyRating) {
        this.student = student;
        this.grade = grade;
        this.facultyRating = facultyRating;
    }

    public String course1() {
        q = generateRandom();
        return c.getCourse(q);
    }

    public String course2() {
        p = generateRandom();
        if (p == q) {
            generateRandom();
        }
        return c.getCourse(p);
    }

    public int generateRandom() {
        return r.nextInt(5);
    }

    public double getgpa() {
        return ThreadLocalRandom.current().nextDouble(0.0, 4.0);
    }

    public int getRating() {
        return r.nextInt(5);
    }

    public String getCourse1() {
        return course1;
    }

    public String getCourse2() {
        return course2;
    }
     public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Rating getFacultyRating() {
        return facultyRating;
    }

    public void setFacultyRating(Rating facultyRating) {
        this.facultyRating = facultyRating;
    }

}
