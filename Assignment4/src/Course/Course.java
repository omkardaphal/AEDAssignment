/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author Omkar
 */
public class Course {

    
    ArrayList courseList;

public Course(String name, int credit, Type type, ArrayList<Course> prerequisites, ArrayList<Course> followups) {
        this.name = name;
        this.credit = credit;
        this.type = type;
        this.prerequisites = prerequisites;
        this.followups = followups;}

public Course(){ 
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
      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<Course> getFollowups() {
        return followups;
    }

    public void setFollowups(ArrayList<Course> followups) {
        this.followups = followups;
    }

    private String name;
    private int credit;

    public enum Type {
        elective, required
    };
    private Type type;
    private ArrayList<Course> prerequisites;
    private ArrayList<Course> followups;

}
