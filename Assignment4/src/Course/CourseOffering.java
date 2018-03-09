/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import Faculty.Faculty;
import University.Seat;
import University.Rating;
import University.Semester;
import java.util.ArrayList;

/**
 *
 * @author MAC
 */
public class CourseOffering {

    private Rating facultyRating;
    private Course course;
    private Semester semester;
    private Faculty faculty;
    private ArrayList<Seat> seats;

    public CourseOffering(Rating facultyRating, Course course, Semester semester, Faculty faculty, ArrayList<Seat> seats) {
        this.facultyRating = facultyRating;
        this.course = course;
        this.semester = semester;
        this.faculty = faculty;
        this.seats = seats;
    }

    public CourseOffering() {
        facultyRating = new Rating(0, 0);
        course = new Course("", 0, Course.Type.elective, null, null);
        semester = new Semester();
        faculty = new Faculty();
        seats = new ArrayList<>();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Rating getFacultyRating() {
        return facultyRating;
    }

    public void setFacultyRating(Rating facultyRating) {
        this.facultyRating = facultyRating;
    }

    public void setFacultyRating() {
        double overallQuality = 0;
        double difficultyLevel = 0;
        int seatCount = 0;
        for (Seat seat : seats) {
            if (seat.isFilled()) {
                overallQuality += seat.getSeatAssignment().getFacultyRating().getOverallQuality();
                difficultyLevel += seat.getSeatAssignment().getFacultyRating().getDifficultyLevel();
                seatCount++;
            }
        }
        facultyRating.setOverallQuality(overallQuality / seatCount);
        facultyRating.setDifficultyLevel(difficultyLevel / seatCount);
    }

}
