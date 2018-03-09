/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author MAC
 */
public class Initialization {
    public static  PatientDirectory InitializePatient ()
    {
        //Create an instance of a patient directory 
        PatientDirectory patients=new PatientDirectory();
         Patient patient=patients.addPatient();
        //Initialize patient personal information
        patient.;
        patient.setFirstName("aaa");
        patient.setLastName("bbb");
        patient.setPhoneNumber ("555-555-5555");
        patient.setAddress("Boston, MA");
}
