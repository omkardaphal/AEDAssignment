/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author User
 */
public class Person {

    String name;

    int age;
    int heartBeatPerMinute;
    String gender;
    float totalCholesterol;
    float hdl;
    String smoker;
    String diabetes;
    int bp;
    String patientForBp;
    float CHDRiskBasedOnLDLPoints;
    float CHDRiskBasedOnCholesterolPoints;

    public float getCHDRiskBasedOnLDLPoints() {
        return CHDRiskBasedOnLDLPoints;
    }

    public void setCHDRiskBasedOnLDLPoints(float CHDRiskBasedOnLDLPoints) {
        this.CHDRiskBasedOnLDLPoints = CHDRiskBasedOnLDLPoints;
    }

    public float getCHDRiskBasedOnCholesterolPoints() {
        return CHDRiskBasedOnCholesterolPoints;
    }

    public void setCHDRiskBasedOnCholesterolPoints(float CHDRiskBasedOnCholesterolPoints) {
        this.CHDRiskBasedOnCholesterolPoints = CHDRiskBasedOnCholesterolPoints;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeartBeatPerMinute() {
        return heartBeatPerMinute;
    }

    public void setHeartBeatPerMinute(int heartBeatPerMinute) {
        this.heartBeatPerMinute = heartBeatPerMinute;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(float totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public float getHdl() {
        return hdl;
    }

    public void setHdl(float hdl) {
        this.hdl = hdl;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public String getPatientForBp() {
        return patientForBp;
    }

    public void setPatientForBp(String patientForBp) {
        this.patientForBp = patientForBp;
    }
   

    

}
