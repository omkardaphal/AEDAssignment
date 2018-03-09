/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import Course.CourseLoad;

/**
 *
 * @author Omkar
 **/
public class Transcript {

    double avg;

    public void process() {
        CourseLoad cl = new CourseLoad();
        avg = (cl.getGpa1() + cl.getGpa2()) / 2;
    }

    public float getAvg() {
        float n;
        n=(float)avg;
        return n;
       
    }
}
