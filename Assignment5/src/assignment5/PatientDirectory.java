/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;

/**
 *
 * @author MAC
 */
class PatientDirectory {

    public PatientDirectory(ArrayList<Patient> patientsList) {
        this.patientsList = patientsList;
    }

    ArrayList<Patient> patientsList;

    PatientDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(ArrayList<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
    
    public Patient addPatient(){
Patient patient = new Patient();
patientsList.add(patient);

return patient;
}
}
