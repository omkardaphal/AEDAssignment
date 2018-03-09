/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.util.Random;

/**
 *
 * @author MAC
 */
public class FraminghamHeartDiseaseCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       CalaulationRisk CalaulationRisk= new CalaulationRisk();
      CalaulationRisk.CalaulationRiskofCDH();
       
        System.out.println("************My Random Data*************");
        for (Community community:Configuration.initCommunity().getCommunityList()) {
            
            System.out.println("Number -->" + community.getNumberOfHouses());
        }
       
        
        System.out.println("******************Reports*************************");

        System.out.println("*********Welcome to the CITY LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports********* ");
        System.out.println("1.CITY LEVEL REPORTS");
        System.out.println("2.COMMUNITY LEVEL REPORTS");
        System.out.println("3.HOUSE LEVEL REPORTS");
        System.out.println("3.FAMILY LEVEL REPORTS");
        System.out.println("4.PERSON LEVEL REPORTS");
        
        //Your switch statements.

    }

}

