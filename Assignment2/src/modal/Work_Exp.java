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
public class Work_Exp {

    private String company;
    private double duration;
    private String designation;

    public Work_Exp(String company, String designation, double duration) {
        this.company = company;
        this.duration = duration;
        this.designation = designation;

    }

    public String getCompany() {
        return company;
    }

    public String getDesg() {
        return designation;
    }

    public String getDuration() {
        return "" + duration;
    }

}
