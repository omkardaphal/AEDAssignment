/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class CourseCataloge {
    private  ArrayList<Course> courseList;

    public CourseCataloge() {
        this.courseList = new ArrayList<>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
      public Course addStudent(){
Course course = new Course();
courseList.add(course);

return course;

}
    
}
