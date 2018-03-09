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
public class CalaulationRisk {
    
   MaleHealthSystem maleHealthSystem =new MaleHealthSystem();
    FemaleHealthSystem femaleHealthSystem= new FemaleHealthSystem();
<<<<<<< HEAD
    float riskForMale;
    float riskForFemale;
    
    public void CalaulationRiskofCDH(){
        
        int man=1;
        int women=1;
=======
    
    
    public void CalaulationRiskofCDH(){
        
        
>>>>>>> 36505b48e2994d6c500e5f935221c684689d5a81
    
    for (Community community:Configuration.initCommunity().getCommunityList())
    {
    for(House house:community.getHouseList().getComHouses())
    
    {
     
    for(int i=0; i<house.getHouseListOfCom().length;i++){
        
        for (int j=0;j<house.getNumberOfFamily();j++)
        {
        
         for(Family family:house.getFl().getFamily()){
         
         for(Person person:family.personDirectory.getPersonList()){
             int totalOfLDL;
             int totalOfChol;
             if (person.getGender()=="Male")
             {
           totalOfLDL=  maleHealthSystem.calculateMaleLDLPointsForAge(person.getAge())+
                   maleHealthSystem.calculateMaleLDLPointsForLDLC(person.getTotalCholesterol())+
                   maleHealthSystem.calculateMaleLDLPointsForHDLC(person.getHdl())+
                   maleHealthSystem.calculateMalePointsForBloodPressure(person.getBp())+
                   maleHealthSystem.calculateMaleLDLPointsForDiabetes(person.getDiabetes())+
                  
                  maleHealthSystem.calculateMaleLDLPointsForSmoker(person.getSmoker());
           
           totalOfChol = maleHealthSystem.calculateMaleCholestrolPointsForAge(person.getAge())+
                   maleHealthSystem.calculateMaleCholestrolPointsForCholestrol(person.getTotalCholesterol())+
                   maleHealthSystem.calculateMaleCholestrolPointsForHDLC(person.getHdl())+
                   maleHealthSystem.calculateMalePointsForBloodPressure(person.getBp())+
                   maleHealthSystem.calculateMaleCholestrolPointsForDiabetes(person.getDiabetes())+
                   maleHealthSystem.calculateMaleLDLPointsForSmoker(person.getSmoker());
           
                   
<<<<<<< HEAD
                  riskForMale=( (maleHealthSystem.calculateCHDRiskBasedOnCholestrolPointsForMalePatient(totalOfLDL)+
                                maleHealthSystem.calculateCHDRiskBasedOnLDLPointsForMalePatient(totalOfChol))/2)*100;
                  
                  System.out.println("/risk for male "+man+" is "+ riskForMale+"%");
                   man++;
=======
                  int u= maleHealthSystem.calculateCHDRiskBasedOnCholestrolPointsForMalePatient(totalOfLDL)
                   
>>>>>>> 36505b48e2994d6c500e5f935221c684689d5a81
             }
         
             else if (person.getGender()=="Female")
             {
                 totalOfLDL=  femaleHealthSystem.calculateFemaleLDLPointsForAge(person.getAge())+
                   femaleHealthSystem.calculateFemaleLDLPointsForLDLC(person.getTotalCholesterol())+
                   femaleHealthSystem.calculateFemaleLDLPointsForHDLC(person.getHdl())+
                   femaleHealthSystem.calculateFemalePointsForBloodPressure(person.getBp())+
                   femaleHealthSystem.calculateFemaleLDLPointsForDiabetes(person.getDiabetes())+
                   femaleHealthSystem.calculateFemaleLDLPointsForSmoker(person.getSmoker());
           
           totalOfChol = femaleHealthSystem.calculateFemaleCholestrolPointsForAge(person.getAge())+
                   femaleHealthSystem.calculateFemaleCholestrolPointsForCholestrol(person.getTotalCholesterol())+
                   femaleHealthSystem.calculateFemaleCholestrolPointsForHDLC(person.getHdl())+
                   femaleHealthSystem.calculateFemalePointsForBloodPressure(person.getBp())+
                   femaleHealthSystem.calculateFemaleCholestrolPointsForDiabetes(person.getDiabetes())+
                   femaleHealthSystem.calculateFemaleLDLPointsForSmoker(person.getSmoker());
           
<<<<<<< HEAD
                         riskForFemale=( (femaleHealthSystem.calculateCHDRiskBasedOnLDLPointsForFemalePatient(totalOfLDL)+
                                femaleHealthSystem.calculateCHDRiskBasedOnCholestrolPointsForFemalePatient(totalOfChol))/2)*100;
                  
                  System.out.println("/risk for female "+women+" is "+ riskForFemale+"%");
                  women ++;
=======
             
             
>>>>>>> 36505b48e2994d6c500e5f935221c684689d5a81
             }
         
         
         }
         }
        
        }
    
    
    }
    
    }
    
    }
     
    }
    
  
    
}
