/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;


import studentsInfo.StudentsDirectory;

/**
 *
 * @author MAC
 */
public class Department {

    private String name;
    private FacultyDirectory facultyDirectory;
    private StudentsDirectory studentsDirectory;

    public Department(String name, FacultyDirectory facultyDirectory) {
        this.name = name;
        this.facultyDirectory = facultyDirectory;
        
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentsDirectory getStudentsDirectory() {
        return studentsDirectory;
    }

    public void setStudentsDirectory(StudentsDirectory studentsDirectory) {
        this.studentsDirectory = studentsDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }
}
