/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;

import studentsInfo.Student;

/**
 *
 * @author MAC
 */
public class InitializeFacultyList {

    public static FacultyDirectory initializeInformationSystemsFacultyDirectory() {
        //Create an instance of a student directory 
        FacultyDirectory facultyList = new FacultyDirectory();
        Faculty faculty1 = facultyList.addFaculty();
        //Initialize faculty personal information
        // FACULTY 1
        faculty1.setName("Ali Abur");
        faculty1.setRank(Faculty.Rank.Full);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering1 = new CourseOffering();

        Course c1 = new Course("Database", 300, Course.Type.required, null, null);
        courseOffering1.setCourse(c1);
        courseOffering1.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList1 = new ArrayList<>();
        Seat seat1 = new Seat(true, new SeatAssignment(new Student(1234, "John", "Smith", "987 654 3210", "123 longway st. Boston MA", "Information Systems"), 3.3, new Rating(3.2, 3.4)));
        Seat seat2 = new Seat(true, new SeatAssignment(new Student(4321, "Mary", "Jackson", "102 432 6523", "985 Boylston st. Boston MA", "Information Systems"), 3.6, new Rating(3.1, 3.6)));
        Seat seat3 = new Seat(true, new SeatAssignment(new Student(5422, "Roy", "Brown", "542 345 5325", "432 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(3.3, 3.5)));

        seatList1.add(seat1);
        seatList1.add(seat2);
        seatList1.add(seat3);
        courseOffering1.setSeats(seatList1);
        courseOffering1.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering2 = new CourseOffering();

        Course c2 = new Course("Web Design", 200, Course.Type.elective, null, null);
        courseOffering2.setCourse(c2);
        courseOffering2.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList2 = new ArrayList<>();
        Seat seat4 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Smith", "433 035 8553", "123 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.7, 3.9)));
        Seat seat5 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Johonson", "635 0538 7553", "985 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.8, 3.1)));
        Seat seat6 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Raymond", "984 235 8573", "432 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.4)));

        seatList2.add(seat4);
        seatList2.add(seat5);
        seatList2.add(seat6);
        courseOffering2.setSeats(seatList2);
        courseOffering2.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering3 = new CourseOffering();

        Course c3 = new Course("C++ Programming", 300, Course.Type.required, null, null);
        courseOffering3.setCourse(c3);
        courseOffering3.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList3 = new ArrayList<>();
        Seat seat7 = new Seat(true, new SeatAssignment(new Student(6332, "Jack", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat8 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat9 = new Seat(true, new SeatAssignment(new Student(1245, "Matt", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList3.add(seat7);
        seatList3.add(seat8);
        seatList3.add(seat9);
        courseOffering3.setSeats(seatList3);
        courseOffering3.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList = new ArrayList<>();
        courseOfferingList.add(courseOffering1);
        courseOfferingList.add(courseOffering2);
        courseOfferingList.add(courseOffering3);
        faculty1.setCourseOfferings(courseOfferingList);
        faculty1.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 2
        Faculty faculty2 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty2.setName("Elizabeth Craige");
        faculty2.setRank(Faculty.Rank.Assistant);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering12 = new CourseOffering();

        Course c12 = new Course("Python Programming", 100, Course.Type.elective, null, null);
        courseOffering12.setCourse(c12);
        courseOffering12.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList12 = new ArrayList<>();
        Seat seat12 = new Seat(true, new SeatAssignment(new Student(1234, "Samual", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(3.2, 3.7)));
        Seat seat22 = new Seat(true, new SeatAssignment(new Student(4321, "Brad", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(3.1, 3.5)));
        Seat seat32 = new Seat(true, new SeatAssignment(new Student(5422, "Rita", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(1.2, 3.2)));

        seatList12.add(seat12);
        seatList12.add(seat22);
        seatList12.add(seat32);
        courseOffering12.setSeats(seatList12);
        courseOffering12.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering22 = new CourseOffering();

        Course c22 = new Course("Operating Systems", 300, Course.Type.required, null, null);
        courseOffering2.setCourse(c22);
        courseOffering2.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList22 = new ArrayList<>();
        Seat seat42 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.4, 3.5)));
        Seat seat52 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.7, 3.3)));
        Seat seat62 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.2)));

        seatList22.add(seat42);
        seatList22.add(seat52);
        seatList22.add(seat62);
        courseOffering22.setSeats(seatList22);
        courseOffering22.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering32 = new CourseOffering();

        Course c32 = new Course("Business Management", 300, Course.Type.required, null, null);
        courseOffering32.setCourse(c32);
        courseOffering32.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList32 = new ArrayList<>();
        Seat seat72 = new Seat(true, new SeatAssignment(new Student(6332, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat82 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat92 = new Seat(true, new SeatAssignment(new Student(1245, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList32.add(seat72);
        seatList32.add(seat82);
        seatList32.add(seat92);
        courseOffering32.setSeats(seatList32);
        courseOffering32.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList2 = new ArrayList<>();
        courseOfferingList2.add(courseOffering12);
        courseOfferingList2.add(courseOffering22);
        courseOfferingList2.add(courseOffering32);
        faculty2.setCourseOfferings(courseOfferingList2);
        faculty2.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 3
        Faculty faculty3 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty3.setName("Tim Richardson");
        faculty3.setRank(Faculty.Rank.Associate);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering13 = new CourseOffering();

        Course c13 = new Course("C Programming", 200, Course.Type.elective, null, null);
        courseOffering13.setCourse(c13);
        courseOffering13.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList13 = new ArrayList<>();
        Seat seat13 = new Seat(true, new SeatAssignment(new Student(1234, "Angelina", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(1.2, 3.7)));
        Seat seat23 = new Seat(true, new SeatAssignment(new Student(4321, "Katy", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(4.1, 3.5)));
        Seat seat33 = new Seat(true, new SeatAssignment(new Student(5422, "Tom", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(2.2, 3.2)));

        seatList13.add(seat13);
        seatList13.add(seat23);
        seatList13.add(seat33);
        courseOffering13.setSeats(seatList13);
        courseOffering13.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering23 = new CourseOffering();

        Course c23 = new Course("Data Science", 300, Course.Type.required, null, null);
        courseOffering23.setCourse(c23);
        courseOffering3.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList23 = new ArrayList<>();
        Seat seat43 = new Seat(true, new SeatAssignment(new Student(5315, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(2.1, 3.5)));
        Seat seat53 = new Seat(true, new SeatAssignment(new Student(5621, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.2, new Rating(1.7, 2.3)));
        Seat seat63 = new Seat(true, new SeatAssignment(new Student(5321, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.2, new Rating(3.5, 3.2)));

        seatList23.add(seat43);
        seatList23.add(seat53);
        seatList23.add(seat63);
        courseOffering23.setSeats(seatList23);
        courseOffering23.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering33 = new CourseOffering();

        Course c33 = new Course("Business Analytics", 300, Course.Type.elective, null, null);
        courseOffering33.setCourse(c33);
        courseOffering33.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList33 = new ArrayList<>();
        Seat seat73 = new Seat(true, new SeatAssignment(new Student(5132, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.7, 2.1)));
        Seat seat83 = new Seat(true, new SeatAssignment(new Student(5311, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.2, 3.2)));
        Seat seat93 = new Seat(true, new SeatAssignment(new Student(5221, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.9, 2.9)));

        seatList33.add(seat73);
        seatList33.add(seat83);
        seatList33.add(seat93);
        courseOffering33.setSeats(seatList33);
        courseOffering33.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList3 = new ArrayList<>();
        courseOfferingList3.add(courseOffering13);
        courseOfferingList3.add(courseOffering23);
        courseOfferingList3.add(courseOffering33);
        faculty3.setCourseOfferings(courseOfferingList3);
        faculty3.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        return facultyList;
    }

    public static FacultyDirectory initializeComputerScienceFacultyDirectory() {
        //Create an instance of a student directory 
        FacultyDirectory facultyList = new FacultyDirectory();
        Faculty faculty1 = facultyList.addFaculty();
        //Initialize faculty personal information
        // FACULTY 1
        faculty1.setName("Ali Abur");
        faculty1.setRank(Faculty.Rank.Full);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering1 = new CourseOffering();

        Course c1 = new Course("Database", 300, Course.Type.required, null, null);
        courseOffering1.setCourse(c1);
        courseOffering1.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList1 = new ArrayList<>();
        Seat seat1 = new Seat(true, new SeatAssignment(new Student(1234, "John", "Smith", "987 654 3210", "123 longway st. Boston MA", "Information Systems"), 3.3, new Rating(3.2, 3.4)));
        Seat seat2 = new Seat(true, new SeatAssignment(new Student(4321, "Mary", "Jackson", "102 432 6523", "985 Boylston st. Boston MA", "Information Systems"), 3.6, new Rating(3.1, 3.6)));
        Seat seat3 = new Seat(true, new SeatAssignment(new Student(5422, "Roy", "Brown", "542 345 5325", "432 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(3.3, 3.5)));

        seatList1.add(seat1);
        seatList1.add(seat2);
        seatList1.add(seat3);
        courseOffering1.setSeats(seatList1);
        courseOffering1.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering2 = new CourseOffering();

        Course c2 = new Course("Web Design", 200, Course.Type.elective, null, null);
        courseOffering2.setCourse(c2);
        courseOffering2.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList2 = new ArrayList<>();
        Seat seat4 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Smith", "433 035 8553", "123 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.7, 3.9)));
        Seat seat5 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Johonson", "635 0538 7553", "985 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.8, 3.1)));
        Seat seat6 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Raymond", "984 235 8573", "432 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.4)));

        seatList2.add(seat4);
        seatList2.add(seat5);
        seatList2.add(seat6);
        courseOffering2.setSeats(seatList2);
        courseOffering2.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering3 = new CourseOffering();

        Course c3 = new Course("C++ Programming", 300, Course.Type.required, null, null);
        courseOffering3.setCourse(c3);
        courseOffering3.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList3 = new ArrayList<>();
        Seat seat7 = new Seat(true, new SeatAssignment(new Student(6332, "Jack", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat8 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat9 = new Seat(true, new SeatAssignment(new Student(1245, "Matt", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList3.add(seat7);
        seatList3.add(seat8);
        seatList3.add(seat9);
        courseOffering3.setSeats(seatList3);
        courseOffering3.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList = new ArrayList<>();
        courseOfferingList.add(courseOffering1);
        courseOfferingList.add(courseOffering2);
        courseOfferingList.add(courseOffering3);
        faculty1.setCourseOfferings(courseOfferingList);
        faculty1.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 2
        Faculty faculty2 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty2.setName("Elizabeth Craige");
        faculty2.setRank(Faculty.Rank.Assistant);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering12 = new CourseOffering();

        Course c12 = new Course("Python Programming", 100, Course.Type.elective, null, null);
        courseOffering12.setCourse(c12);
        courseOffering12.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList12 = new ArrayList<>();
        Seat seat12 = new Seat(true, new SeatAssignment(new Student(1234, "Samual", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(3.2, 3.7)));
        Seat seat22 = new Seat(true, new SeatAssignment(new Student(4321, "Brad", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(3.1, 3.5)));
        Seat seat32 = new Seat(true, new SeatAssignment(new Student(5422, "Rita", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(1.2, 3.2)));

        seatList12.add(seat12);
        seatList12.add(seat22);
        seatList12.add(seat32);
        courseOffering12.setSeats(seatList12);
        courseOffering12.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering22 = new CourseOffering();

        Course c22 = new Course("Operating Systems", 300, Course.Type.required, null, null);
        courseOffering2.setCourse(c22);
        courseOffering2.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList22 = new ArrayList<>();
        Seat seat42 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.4, 3.5)));
        Seat seat52 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.7, 3.3)));
        Seat seat62 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.2)));

        seatList22.add(seat42);
        seatList22.add(seat52);
        seatList22.add(seat62);
        courseOffering22.setSeats(seatList22);
        courseOffering22.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering32 = new CourseOffering();

        Course c32 = new Course("Business Management", 300, Course.Type.required, null, null);
        courseOffering32.setCourse(c32);
        courseOffering32.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList32 = new ArrayList<>();
        Seat seat72 = new Seat(true, new SeatAssignment(new Student(6332, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat82 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat92 = new Seat(true, new SeatAssignment(new Student(1245, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList32.add(seat72);
        seatList32.add(seat82);
        seatList32.add(seat92);
        courseOffering32.setSeats(seatList32);
        courseOffering32.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList2 = new ArrayList<>();
        courseOfferingList2.add(courseOffering12);
        courseOfferingList2.add(courseOffering22);
        courseOfferingList2.add(courseOffering32);
        faculty2.setCourseOfferings(courseOfferingList2);
        faculty2.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 3
        Faculty faculty3 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty3.setName("Tim Richardson");
        faculty3.setRank(Faculty.Rank.Associate);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering13 = new CourseOffering();

        Course c13 = new Course("C Programming", 200, Course.Type.elective, null, null);
        courseOffering13.setCourse(c13);
        courseOffering13.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList13 = new ArrayList<>();
        Seat seat13 = new Seat(true, new SeatAssignment(new Student(1234, "Angelina", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(1.2, 3.7)));
        Seat seat23 = new Seat(true, new SeatAssignment(new Student(4321, "Katy", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(4.1, 3.5)));
        Seat seat33 = new Seat(true, new SeatAssignment(new Student(5422, "Tom", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(2.2, 3.2)));

        seatList13.add(seat13);
        seatList13.add(seat23);
        seatList13.add(seat33);
        courseOffering13.setSeats(seatList13);
        courseOffering13.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering23 = new CourseOffering();

        Course c23 = new Course("Data Science", 300, Course.Type.required, null, null);
        courseOffering23.setCourse(c23);
        courseOffering3.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList23 = new ArrayList<>();
        Seat seat43 = new Seat(true, new SeatAssignment(new Student(5315, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(2.1, 3.5)));
        Seat seat53 = new Seat(true, new SeatAssignment(new Student(5621, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.2, new Rating(1.7, 2.3)));
        Seat seat63 = new Seat(true, new SeatAssignment(new Student(5321, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.2, new Rating(3.5, 3.2)));

        seatList23.add(seat43);
        seatList23.add(seat53);
        seatList23.add(seat63);
        courseOffering23.setSeats(seatList23);
        courseOffering23.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering33 = new CourseOffering();

        Course c33 = new Course("Business Analytics", 300, Course.Type.elective, null, null);
        courseOffering33.setCourse(c33);
        courseOffering33.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList33 = new ArrayList<>();
        Seat seat73 = new Seat(true, new SeatAssignment(new Student(5132, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.7, 2.1)));
        Seat seat83 = new Seat(true, new SeatAssignment(new Student(5311, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.2, 3.2)));
        Seat seat93 = new Seat(true, new SeatAssignment(new Student(5221, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.9, 2.9)));

        seatList33.add(seat73);
        seatList33.add(seat83);
        seatList33.add(seat93);
        courseOffering33.setSeats(seatList33);
        courseOffering33.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList3 = new ArrayList<>();
        courseOfferingList3.add(courseOffering13);
        courseOfferingList3.add(courseOffering23);
        courseOfferingList3.add(courseOffering33);
        faculty3.setCourseOfferings(courseOfferingList3);
        faculty3.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        return facultyList;
    }

    public static FacultyDirectory initializePhysicsFacultyDirectory() {
        //Create an instance of a student directory 
        FacultyDirectory facultyList = new FacultyDirectory();
        Faculty faculty1 = facultyList.addFaculty();
        //Initialize faculty personal information
        // FACULTY 1
        faculty1.setName("Ali Abur");
        faculty1.setRank(Faculty.Rank.Full);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering1 = new CourseOffering();

        Course c1 = new Course("Database", 300, Course.Type.required, null, null);
        courseOffering1.setCourse(c1);
        courseOffering1.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList1 = new ArrayList<>();
        Seat seat1 = new Seat(true, new SeatAssignment(new Student(1234, "John", "Smith", "987 654 3210", "123 longway st. Boston MA", "Information Systems"), 3.3, new Rating(3.2, 3.4)));
        Seat seat2 = new Seat(true, new SeatAssignment(new Student(4321, "Mary", "Jackson", "102 432 6523", "985 Boylston st. Boston MA", "Information Systems"), 3.6, new Rating(3.1, 3.6)));
        Seat seat3 = new Seat(true, new SeatAssignment(new Student(5422, "Roy", "Brown", "542 345 5325", "432 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(3.3, 3.5)));

        seatList1.add(seat1);
        seatList1.add(seat2);
        seatList1.add(seat3);
        courseOffering1.setSeats(seatList1);
        courseOffering1.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering2 = new CourseOffering();

        Course c2 = new Course("Web Design", 200, Course.Type.elective, null, null);
        courseOffering2.setCourse(c2);
        courseOffering2.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList2 = new ArrayList<>();
        Seat seat4 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Smith", "433 035 8553", "123 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.7, 3.9)));
        Seat seat5 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Johonson", "635 0538 7553", "985 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.8, 3.1)));
        Seat seat6 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Raymond", "984 235 8573", "432 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.4)));

        seatList2.add(seat4);
        seatList2.add(seat5);
        seatList2.add(seat6);
        courseOffering2.setSeats(seatList2);
        courseOffering2.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering3 = new CourseOffering();

        Course c3 = new Course("C++ Programming", 300, Course.Type.required, null, null);
        courseOffering3.setCourse(c3);
        courseOffering3.setFaculty(faculty1);
        // initialize seats:
        ArrayList<Seat> seatList3 = new ArrayList<>();
        Seat seat7 = new Seat(true, new SeatAssignment(new Student(6332, "Jack", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat8 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat9 = new Seat(true, new SeatAssignment(new Student(1245, "Matt", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList3.add(seat7);
        seatList3.add(seat8);
        seatList3.add(seat9);
        courseOffering3.setSeats(seatList3);
        courseOffering3.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList = new ArrayList<>();
        courseOfferingList.add(courseOffering1);
        courseOfferingList.add(courseOffering2);
        courseOfferingList.add(courseOffering3);
        faculty1.setCourseOfferings(courseOfferingList);
        faculty1.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 2
        Faculty faculty2 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty2.setName("Elizabeth Craige");
        faculty2.setRank(Faculty.Rank.Assistant);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering12 = new CourseOffering();

        Course c12 = new Course("Python Programming", 100, Course.Type.elective, null, null);
        courseOffering12.setCourse(c12);
        courseOffering12.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList12 = new ArrayList<>();
        Seat seat12 = new Seat(true, new SeatAssignment(new Student(1234, "Samual", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(3.2, 3.7)));
        Seat seat22 = new Seat(true, new SeatAssignment(new Student(4321, "Brad", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(3.1, 3.5)));
        Seat seat32 = new Seat(true, new SeatAssignment(new Student(5422, "Rita", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(1.2, 3.2)));

        seatList12.add(seat12);
        seatList12.add(seat22);
        seatList12.add(seat32);
        courseOffering12.setSeats(seatList12);
        courseOffering12.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering22 = new CourseOffering();

        Course c22 = new Course("Operating Systems", 300, Course.Type.required, null, null);
        courseOffering2.setCourse(c22);
        courseOffering2.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList22 = new ArrayList<>();
        Seat seat42 = new Seat(true, new SeatAssignment(new Student(3005, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(3.4, 3.5)));
        Seat seat52 = new Seat(true, new SeatAssignment(new Student(4262, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.7, 3.3)));
        Seat seat62 = new Seat(true, new SeatAssignment(new Student(5326, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.9, new Rating(3.7, 3.2)));

        seatList22.add(seat42);
        seatList22.add(seat52);
        seatList22.add(seat62);
        courseOffering22.setSeats(seatList22);
        courseOffering22.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering32 = new CourseOffering();

        Course c32 = new Course("Business Management", 300, Course.Type.required, null, null);
        courseOffering32.setCourse(c32);
        courseOffering32.setFaculty(faculty2);
        // initialize seats:
        ArrayList<Seat> seatList32 = new ArrayList<>();
        Seat seat72 = new Seat(true, new SeatAssignment(new Student(6332, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.6, 2.1)));
        Seat seat82 = new Seat(true, new SeatAssignment(new Student(7352, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.4, 3.2)));
        Seat seat92 = new Seat(true, new SeatAssignment(new Student(1245, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.7, 2.9)));

        seatList32.add(seat72);
        seatList32.add(seat82);
        seatList32.add(seat92);
        courseOffering32.setSeats(seatList32);
        courseOffering32.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList2 = new ArrayList<>();
        courseOfferingList2.add(courseOffering12);
        courseOfferingList2.add(courseOffering22);
        courseOfferingList2.add(courseOffering32);
        faculty2.setCourseOfferings(courseOfferingList2);
        faculty2.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        // FACULTY 3
        Faculty faculty3 = facultyList.addFaculty();
        //Initialize faculty personal information
        faculty3.setName("Tim Richardson");
        faculty3.setRank(Faculty.Rank.Associate);
        // Initialize cousre offering lists
        // Course offering 1
        CourseOffering courseOffering13 = new CourseOffering();

        Course c13 = new Course("C Programming", 200, Course.Type.elective, null, null);
        courseOffering13.setCourse(c13);
        courseOffering13.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList13 = new ArrayList<>();
        Seat seat13 = new Seat(true, new SeatAssignment(new Student(1234, "Angelina", "Smith", "987 679 3210", "123 Longwood st. Boston MA", "Information Systems"), 3.6, new Rating(1.2, 3.7)));
        Seat seat23 = new Seat(true, new SeatAssignment(new Student(4321, "Katy", "Jackson", "102 097 8079", "985 Tremont st. Boston MA", "Information Systems"), 3.1, new Rating(4.1, 3.5)));
        Seat seat33 = new Seat(true, new SeatAssignment(new Student(5422, "Tom", "Bush", "789 757 5325", "523 Beacon st. Boston MA", "Information Systems"), 3.8, new Rating(2.2, 3.2)));

        seatList13.add(seat13);
        seatList13.add(seat23);
        seatList13.add(seat33);
        courseOffering13.setSeats(seatList13);
        courseOffering13.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 2
        CourseOffering courseOffering23 = new CourseOffering();

        Course c23 = new Course("Data Science", 300, Course.Type.required, null, null);
        courseOffering23.setCourse(c23);
        courseOffering3.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList23 = new ArrayList<>();
        Seat seat43 = new Seat(true, new SeatAssignment(new Student(5315, "George", "Samual", "433 035 8553", "634 Commonwealth Ave. Boston MA", "Information Systems"), 3.5, new Rating(2.1, 3.5)));
        Seat seat53 = new Seat(true, new SeatAssignment(new Student(5621, "Melissa", "Jackson", "635 0538 7553", "522 Broadway st. Cambridge MA", "Information Systems"), 3.2, new Rating(1.7, 2.3)));
        Seat seat63 = new Seat(true, new SeatAssignment(new Student(5321, "Sam", "Rickie", "532 535 8573", "52 Memorial Dr. Cambridge MA", "Information Systems"), 3.2, new Rating(3.5, 3.2)));

        seatList23.add(seat43);
        seatList23.add(seat53);
        seatList23.add(seat63);
        courseOffering23.setSeats(seatList23);
        courseOffering23.setFacultyRating();
        ///////////////////////////////////////////
        // Course offering 3
        CourseOffering courseOffering33 = new CourseOffering();

        Course c33 = new Course("Business Analytics", 300, Course.Type.elective, null, null);
        courseOffering33.setCourse(c33);
        courseOffering33.setFaculty(faculty3);
        // initialize seats:
        ArrayList<Seat> seatList33 = new ArrayList<>();
        Seat seat73 = new Seat(true, new SeatAssignment(new Student(5132, "George", "Smith", "562 523 5345", "123 Beacon St. Boston MA", "Information Systems"), 3.5, new Rating(2.7, 2.1)));
        Seat seat83 = new Seat(true, new SeatAssignment(new Student(5311, "Elissa", "Thomson", "635 5365 7553", "985 Clinton st. Cambridge MA", "Information Systems"), 3.6, new Rating(3.2, 3.2)));
        Seat seat93 = new Seat(true, new SeatAssignment(new Student(5221, "Scott", "Brown", "642 356 1456", "432 Dartmouth Dr. Boston MA", "Information Systems"), 3.9, new Rating(2.9, 2.9)));

        seatList33.add(seat73);
        seatList33.add(seat83);
        seatList33.add(seat93);
        courseOffering33.setSeats(seatList33);
        courseOffering33.setFacultyRating();
        ///////////////////////////////////////////
        ArrayList<CourseOffering> courseOfferingList3 = new ArrayList<>();
        courseOfferingList3.add(courseOffering13);
        courseOfferingList3.add(courseOffering23);
        courseOfferingList3.add(courseOffering33);
        faculty3.setCourseOfferings(courseOfferingList3);
        faculty3.setRating();
        ///////////////////////////////////////////////////////////////////////////////

        return facultyList;
    }

}
