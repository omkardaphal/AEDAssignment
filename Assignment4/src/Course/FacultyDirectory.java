/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author MAC
 */
public class FacultyDirectory {

    private ArrayList<Faculty> facultyList;

    public FacultyDirectory() {
        facultyList = new ArrayList<Faculty>();
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
    //Add a new faculty to the list 

    public Faculty addFaculty() {
        Faculty faculty = new Faculty();
        facultyList.add(faculty);

        return faculty;

    }

}
