/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author swappy
 */
public class Education {

    private String school;
    private double gpa;
    private String degree;
    private String month_Year;

    public Education(String school, String degree, double gpa, String month_year) {
        this.school = school;
        this.degree = degree;
        this.gpa = gpa;
        this.month_Year = month_year;
    }

    public String getSchool() {
        return school;

    }

    public String getDegree() {
        return degree;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMonth_Year() {
        return month_Year;
    }
}
