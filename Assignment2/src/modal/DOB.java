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
public class DOB {

    int year;
    int month;
    int day;

    public DOB(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

}
