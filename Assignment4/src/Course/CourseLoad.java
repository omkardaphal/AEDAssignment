/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import University.SeatAssignment;

/**
 *
 * @author Omkar
 */
public class CourseLoad {

    double gpa1, gpa2;
    SeatAssignment seat;

    public CourseLoad() {
        seat = new SeatAssignment();
        getSeatAssignments();

    }

    public void getSeatAssignments() {
        gpa1 = seat.getgpa();
        gpa2 = seat.getgpa();

    }

    public double getGpa1() {
        return gpa1;
    }

    public double getGpa2() {
        return gpa2;
    }

}
