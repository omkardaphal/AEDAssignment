/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class FamilyList {
    
  private ArrayList<Family> Family ;

    public FamilyList() {
        Family=new ArrayList<Family>();
    }

    public ArrayList<Family> getFamily() {
        return Family;
    }

    public void setFamily(ArrayList<Family> Family) {
        this.Family = Family;
    }
 
 

    
    


     public Family addFamily(){
     Family family= new Family();
     Family.add(family);
     return family;
     }
   
    
    
    
}
