/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;


import java.util.Random;

/**
 *
 * @author User
 */
public class Configuration {
       static int sum=0 ;
       static int numFamilies;
       static int totalFamily =0;
       static int[]  numHouse = new  int[5] ;
      static boolean ch = false ;
     static int[]  houseList = null ;
  

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    
    
    

    public static CommunityList initCommunity() {
        CommunityList communityList =new CommunityList();
      
        
        Random rand = new Random();
    String [] name = {"John","Garfield", "Barney","Welma","Betty","Dino","Judy","Flint"};
    String [] gender = {"Male","Female"};
    String [] smoker = {"yes","no"};
    String [] diabetes = {"yes", "no"};
    String [] patientForBp = {"yes", "no"};
  
             // for loop to check number of houses in all comminity equal 100
            for (int l = 0; l <4 ; l++){
          numHouse[l]= randInt(20, 25);
               
                sum= sum+numHouse[l];
                  
            }
           numHouse[4]= 100-sum;
       
       
// assigning the number of houses n each comminity
        for (int i = 0; i <numHouse.length ; i++) {
            System.out.println("Community "+i);
            Community community = communityList.addCommunity();
    
            community.setNumberOfHouses(numHouse[i]);
            House house=community.getHouseList().addHouse();
             houseList= new int[numHouse[i]];
           house.setHouseListOfCom(houseList);
            
            System.out.println("Number of houses in comminity "+ i + " are " + house.getHouseListOfCom().length);
         
         // for each house assign the number of families
           for(int k=0; k<houseList.length;k++){
       houseList[k]=randInt(1, 3);
       house.setNumberOfFamily( houseList[k]);
       //int numOfFam;
       //numOfFam = house.getNumberOfFamily();
        System.out.println("Number of family in house " + k + " are " +houseList[k]);
       numFamilies= numFamilies+houseList[k];
       
       //for each family assign the family member
       for (int j=0; j<house.getNumberOfFamily(); j++){
          Family fl= house.getFl().addFamily();
          fl.familyMembers=randInt(4, 6);
          
         //for each member assign vital sign data randomly 
          for (int p=0; p<fl.getFamilyMembers(); p++){
              
           Person person= fl.personDirectory.addPerson();
           String n = name [rand.nextInt(name.length)];
           person.setName(n);
           person.setAge(randInt(30, 80));
           String g = gender [rand.nextInt(gender.length)];
           person.setGender(g);
           person.setTotalCholesterol(randInt(160, 280));
           person.setHdl(randInt(35, 60));
           String s = smoker [rand.nextInt(smoker.length)];
           person.setSmoker(s);
           String d = diabetes [rand.nextInt(diabetes.length)];
           person.setDiabetes(d);
           person.setBp(randInt(80, 160));
           String bp = patientForBp [rand.nextInt(patientForBp.length)];
           person.setPatientForBp(bp);
           
           
           }
         
       }
       
       }
           
            System.out.println("Total number of families in Community "+i+ " are " + numFamilies);
            totalFamily=totalFamily + numFamilies;
            numFamilies=0;
            
                 }
        System.out.println("Total family in city " + totalFamily);
        
        
     
        
        
     
        return communityList;
        
        }
    

    public static int getSum() {
        return sum;
    }

   

    public static int[] getNumHouse() {
        return numHouse;
    }

    public static void setNumHouse(int[] numHouse) {
        Configuration.numHouse = numHouse;
    }
    

}
