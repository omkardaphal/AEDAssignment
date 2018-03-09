/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employment;

import java.util.ArrayList;

/**
 *
 * @author Omkar
 */
public class Course {

    ArrayList courseList;

    public Course() {
        courseList = new ArrayList();
        courseList.add("C1");
        courseList.add("C2");
        courseList.add("C3");
        courseList.add("C4");
        courseList.add("C5");

    }

    public String getCourse(int index) {
        return courseList.get(index).toString();
    }

}
