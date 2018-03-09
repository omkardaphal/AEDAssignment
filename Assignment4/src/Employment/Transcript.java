/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employment;

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

    public double getAvg() {
        
        float n;
        n=(float)avg;
        return n;
    }
}
