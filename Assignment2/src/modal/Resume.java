/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author swappy
 */
public class Resume {

    private String name, image_path, Address1, Gender, phNo, affilation, Desg, joining;
    private DOB date_Of_Birth;
    private Education edu;
    private ArrayList<Work_Exp> work;
    private ArrayList<Education> eduList;
    private ArrayList<String> skills;

    public Resume() {
        eduList = new ArrayList<Education>();
        work = new ArrayList<Work_Exp>();
        skills = new ArrayList<>();
    }

    public void addSkills(String a) {
        skills.add(a);
    }

    public void setJoining(String a) {
        this.joining = a;
    }

    public String getJoining() {
        return joining;
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setDesg(String a) {
        this.Desg = a;
    }

    public void setDob(DOB a) {
        this.date_Of_Birth = a;
    }

    public void setImage_path(String a) {
        this.image_path = a;

    }

    public void setAddress1(String a) {
        this.Address1 = a;
    }

    public void setGender(String a) {
        this.Gender = a;
    }

    public void setPhNo(String a) {
        this.phNo = a;
    }

    public void setAffilation(String a) {
        this.affilation = a;
    }

    public void addWork(Work_Exp w) {
        work.add(w);
    }

    public void addEdu(Education e) {
        eduList.add(e);
    }

    public ArrayList getEdu() {
        return eduList;
    }

    public String getName() {
        return name;
    }

    public ArrayList getSkills() {
        return skills;
    }

    public String getDob() {
        return date_Of_Birth.getDate();
    }

    public String getImage_path() {
        return image_path;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getGender() {
        return Gender;
    }

    public String getPhne() {
        return phNo;
    }

    public String getDesg() {
        return Desg;
    }

    public String getAffilation() {
        return affilation;
    }

    public ArrayList<Work_Exp> getWork() {
        return work;
    }
}
