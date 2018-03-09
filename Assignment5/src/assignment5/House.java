/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author lenovo
 */
public class House {
       private   int[] houseListOfCom;
       private int numberOfFamily;
       
FamilyList fl = new FamilyList();
    public int[] getHouseListOfCom() {
        return houseListOfCom;
    }

    public void setHouseListOfCom(int[] houseListOfCom) {
        this.houseListOfCom = houseListOfCom;
    }

    public int getNumberOfFamily() {
        return numberOfFamily;
    }

    public void setNumberOfFamily(int numberOfFamily) {
        this.numberOfFamily = numberOfFamily;
    }

    public FamilyList getFl() {
        return fl;
    }

    public void setFl(FamilyList fl) {
        this.fl = fl;
    }

    
}
