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
public class MaleHealthSystem {

    CityDirectory cityDirectory;
//Step1
    //Age Male
    public int calculateMaleLDLPointsForAge(int age) {
        
        if (age >= 30 && age <= 34) {
            return -1;
        }
        else if (age >= 35 && age <= 39) {
            return 0;
        }
        else if (age >= 40 && age <= 44) {
            return 1;
        }
        else if (age >= 45 && age <= 49) {
            return 2;
        }
        else if (age >= 50 && age <= 54) {
            return 3;
        }
        else if (age >= 55 && age <= 59) {
            return 4;
        }
        else if (age >= 60 && age <= 64) {
            return 5;
        }
        else if (age >= 65 && age <= 69) {
            return 6;
        }
        else if (age >= 70 && age <= 74) {
            return 7;
        }
        
        else
            return -5;
        
    }

    public int calculateMaleCholestrolPointsForAge(int age) {
        
        if (age >= 30 && age <= 34) {
            return -1;
        }
        else if (age >= 35 && age <= 39) {
            return 0;
        }
        else if (age >= 40 && age <= 44) {
            return 1;
        }
        else if (age >= 45 && age <= 49) {
            return 2;
        }
        else if (age >= 50 && age <= 54) {
            return 3;
        }
        else if (age >= 55 && age <= 59) {
            return 4;
        }
        else if (age >= 60 && age <= 64) {
            return 5;
        }
        else if (age >= 65 && age <= 69) {
            return 6;
        }
        else if (age >= 70 && age <= 74) {
            return 7;
        }
        else 
            return -5;
    }
    
//step2
    // LDL-C male
    public float calculateMaleLDLPointsForLDLC(float Ch) {
        float LDLCholestrol = Ch;
        if (LDLCholestrol < 100) {
            return -3;
        }
        else if (LDLCholestrol >= 100 && LDLCholestrol <= 129) {
            return 0;
        }
        else if (LDLCholestrol >= 130 && LDLCholestrol <= 159) {
            return 0;
        }
        else if (LDLCholestrol >= 160 && LDLCholestrol <= 190) {
            return 1;
        }
        else 
            return 2;
    }

    public float calculateMaleCholestrolPointsForCholestrol(float Ch) {
        float cholestrol =Ch;
        if (cholestrol < 160) {
            return -3;
        }
        else if (cholestrol >= 160 && cholestrol <= 109) {
            return 0;
        }
        else if (cholestrol >= 200 && cholestrol <= 239) {
            return 1;
        }
        else if (cholestrol >= 240 && cholestrol <= 279) {
            return 2;
        }
        else
        return 3;
    }

    
    //step3
    // HDL-c male
    public float calculateMaleLDLPointsForHDLC(float Ch) {
        float HDLCholestrol = Ch;
        if (HDLCholestrol < 35) {
            return 2;
        }
        else if (HDLCholestrol >= 35 && HDLCholestrol <= 44) {
            return 1;
        }
        else if (HDLCholestrol >= 45 && HDLCholestrol <= 49) {
            return 0;
        }
        else if (HDLCholestrol >= 50 && HDLCholestrol <= 59) {
            return 0;
        }
        else 
            return -1;
    }

    public float calculateMaleCholestrolPointsForHDLC(float Ch) {
        float HDLCholestrol = Ch;
        if (HDLCholestrol < 35) {
            return 2;
        }
        else if (HDLCholestrol >= 35 && HDLCholestrol <= 44) {
            return 1;
        }
        else if (HDLCholestrol >= 45 && HDLCholestrol <= 49) {
            return 0;
        }
        else if (HDLCholestrol >= 50 && HDLCholestrol <= 59) {
            return 0;
        }
        else 
            return -2;
    }
    
    
    //Step4
    //BP Male
    public int calculateMalePointsForBloodPressure(int bp) {
        int dyastolic = bp;
        //float systolic = patient.getSystolicBloodPressure();

        int pointsBasedOnDyastolic = 0, pointsBasedOnsystolic = 0;
        if (dyastolic < 80) {
            pointsBasedOnDyastolic = 0;
        }
        else if (dyastolic >= 80 && dyastolic <= 84) {
            pointsBasedOnDyastolic = 0;
        }
        else if (dyastolic >= 85 && dyastolic <= 89) {
            pointsBasedOnDyastolic = 1;
        }
        else if (dyastolic >= 90 && dyastolic <= 99) {
            pointsBasedOnDyastolic = 2;
        }
        else if (dyastolic >= 100) {
            pointsBasedOnDyastolic = 3;
        }

        return pointsBasedOnDyastolic;

    }

    //Step 5
     
    //Diabetes male
    public int calculateMaleLDLPointsForDiabetes(String diabetes) {
       if(diabetes.equals("yes"))
            return 4;
       else 
            return 0;
     }

    public int calculateMaleCholestrolPointsForDiabetes(String diabetes) {
      if(diabetes =="yes")
            return 4;
       else 
            return 0;
     }
    
    

    //Step 6
    //Smoker male
    public int calculateMaleLDLPointsForSmoker(String smoker) {
      if(smoker =="yes")
            return 2;
       else 
            return 0;
     }

    public int calculateMaleCholestrolPointsForSmoker(String smoker) {
        if(smoker =="yes")
            return 2;
       else 
            return 0;
     }
    /*
    
    //Step 7 male
    public int calculateMaleLDLPoints(Patient patient) {
        int sum = 0;
        // Step 1:
        sum += calculateMaleLDLPointsForAge(patient);

        // Step 2: 
        sum += calculateMaleLDLPointsForLDLC(patient);

        // Step 3:
        sum += calculateMaleLDLPointsForHDLC(patient);

        // Step 4: 
        sum += calculateMalePointsForBloodPressure(patient);

        // Step 5:
        sum += calculateMaleLDLPointsForDiabetes(patient);

        // Step 6:
        sum += calculateMaleLDLPointsForSmoker(patient);

        return sum;
    }

    public int calculateMaleCholestrolPoints(Patient patient) {
        int sum = 0;
        // Step 1:
        sum += calculateMaleCholestrolPointsForAge(patient);

        // Step 2: 
        sum += calculateMaleCholestrolPointsForCholestrol(patient);

        // Step 3:
        sum += calculateMaleCholestrolPointsForHDLC(patient);

        // Step 4: 
        sum += calculateMalePointsForBloodPressure(patient);

        // Step 5:
        sum += calculateMaleCholestrolPointsForDiabetes(patient);

        // Step 6:
        sum += calculateMaleCholestrolPointsForSmoker(patient);

        return sum;
    }

    // step7 female
    
      public int calculateFemaleLDLPoints(Patient patient) {
        int sum = 0;
        // Step 1:
        sum += calculateFemaleLDLPointsForAge(patient);

        // Step 2: 
        sum += calculateFemaleLDLPointsForLDLC(patient);

        // Step 3:
        sum += calculateFemaleLDLPointsForHDLC(patient);

        // Step 4: 
        sum += calculateFemalePointsForBloodPressure(patient);

        // Step 5:
        sum += calculateFemaleLDLPointsForDiabetes(patient);

        // Step 6:
        sum += calculateFemaleLDLPointsForSmoker(patient);

        return sum;
    }

    public int calculateFemaleCholestrolPoints(Patient patient) {
        int sum = 0;
        // Step 1:
        sum += calculateFemaleCholestrolPointsForAge(patient);

        // Step 2: 
        sum += calculateFemaleCholestrolPointsForCholestrol(patient);

        // Step 3:
        sum += calculateFemaleCholestrolPointsForHDLC(patient);

        // Step 4: 
        sum += calculateFemalePointsForBloodPressure(patient);

        // Step 5:
        sum += calculateFemaleCholestrolPointsForDiabetes(patient);

        // Step 6:
        sum += calculateFemaleCholestrolPointsForSmoker(patient);

        return sum;
    }*/

    
    //Step 8 male
  public float calculateCHDRiskBasedOnLDLPointsForMalePatient(Patient patient) {
    if (patient.getGender() == Person.Gender.Male) {
            
        int totalPoints = calculateMaleLDLPoints(patient);

        if (totalPoints < -3) {
            patient.setCHDRiskBasedOnLDLPoints(0.01f);
            return 0.01f;
        }

        if (totalPoints == -2) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == -1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 0) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 1) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 2) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 3) {
            patient.setCHDRiskBasedOnLDLPoints(0.06f);
            return 0.06f;
        }

        if (totalPoints == 4) {
            patient.setCHDRiskBasedOnLDLPoints(0.07f);
            return 0.07f;
        }

        if (totalPoints == 5) {
            patient.setCHDRiskBasedOnLDLPoints(0.09f);
            return 0.09f;
        }

        if (totalPoints == 6) {
            patient.setCHDRiskBasedOnLDLPoints(0.11f);
            return 0.11f;
        }

        if (totalPoints == 7) {
            patient.setCHDRiskBasedOnLDLPoints(0.14f);
            return 0.14f;
        }

        if (totalPoints == 8) {
            patient.setCHDRiskBasedOnLDLPoints(0.18f);
            return 0.18f;
        }

        if (totalPoints == 9) {
            patient.setCHDRiskBasedOnLDLPoints(0.22f);
            return 0.22f;
        }

        if (totalPoints == 10) {
            patient.setCHDRiskBasedOnLDLPoints(0.27f);
            return 0.27f;
        }

        if (totalPoints == 11) {
            patient.setCHDRiskBasedOnLDLPoints(0.33f);
            return 0.33f;
        }

        if (totalPoints == 12) {
            patient.setCHDRiskBasedOnLDLPoints(0.40f);
            return 0.40f;
        }

        if (totalPoints == 13) {
            patient.setCHDRiskBasedOnLDLPoints(0.47f);
            return 0.47f;
        }

        if (totalPoints == 14) {
            patient.setCHDRiskBasedOnLDLPoints(0.56f);
            return 0.56f;
        }

        return 0.56f;
    }
     return calculateCHDRiskBasedOnLDLPointsForFemalePatient(patient);
    }
     public float calculateCHDRiskBasedOnCholestrolPointsForMalePatient(Patient patient) {

        int totalPoints = calculateMaleCholestrolPoints(patient);

        if (totalPoints < -1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 0) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 1) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 2) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 3) {
            patient.setCHDRiskBasedOnLDLPoints(0.05f);
            return 0.05f;
        }

        if (totalPoints == 4) {
            patient.setCHDRiskBasedOnLDLPoints(0.07f);
            return 0.07f;
        }

        if (totalPoints == 5) {
            patient.setCHDRiskBasedOnLDLPoints(0.08f);
            return 0.08f;
        }

        if (totalPoints == 6) {
            patient.setCHDRiskBasedOnLDLPoints(0.10f);
            return 0.10f;
        }

        if (totalPoints == 7) {
            patient.setCHDRiskBasedOnLDLPoints(0.13f);
            return 0.13f;
        }

        if (totalPoints == 8) {
            patient.setCHDRiskBasedOnLDLPoints(0.16f);
            return 0.16f;
        }

        if (totalPoints == 9) {
            patient.setCHDRiskBasedOnLDLPoints(0.20f);
            return 0.20f;
        }

        if (totalPoints == 10) {
            patient.setCHDRiskBasedOnLDLPoints(0.25f);
            return 0.25f;
        }

        if (totalPoints == 11) {
            patient.setCHDRiskBasedOnLDLPoints(0.31f);
            return 0.31f;
        }

        if (totalPoints == 12) {
            patient.setCHDRiskBasedOnLDLPoints(0.37f);
            return 0.37f;
        }

        if (totalPoints == 13) {
            patient.setCHDRiskBasedOnLDLPoints(0.45f);
            return 0.45f;
        }

        if (totalPoints >= 14) {
            patient.setCHDRiskBasedOnLDLPoints(0.53f);
            return 0.53f;
        }

        return 0.53f;
    }
     /*

    public float calculateCHDRiskBasedOnLDLPointsForFemalePatient(Patient patient) {
        if (patient.getGender() == Person.Gender.Female) {
            
        int totalPoints = calculateFemaleLDLPoints(patient);

        if (totalPoints < -2) {
            patient.setCHDRiskBasedOnLDLPoints(0.01f);
            return 0.01f;
        }

        if (totalPoints == -1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 0) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 2) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 3) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 4) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 5) {
            patient.setCHDRiskBasedOnLDLPoints(0.05f);
            return 0.05f;
        }

        if (totalPoints == 6) {
            patient.setCHDRiskBasedOnLDLPoints(0.06f);
            return 0.06f;
        }

        if (totalPoints == 7) {
            patient.setCHDRiskBasedOnLDLPoints(0.07f);
            return 0.07f;
        }

        if (totalPoints == 8) {
            patient.setCHDRiskBasedOnLDLPoints(0.08f);
            return 0.08f;
        }

        if (totalPoints == 9) {
            patient.setCHDRiskBasedOnLDLPoints(0.09f);
            return 0.09f;
        }

        if (totalPoints == 10) {
            patient.setCHDRiskBasedOnLDLPoints(0.11f);
            return 0.11f;
        }

        if (totalPoints == 11) {
            patient.setCHDRiskBasedOnLDLPoints(0.13f);
            return 0.13f;
        }

        if (totalPoints == 12) {
            patient.setCHDRiskBasedOnLDLPoints(0.15f);
            return 0.15f;
        }

        if (totalPoints == 13) {
            patient.setCHDRiskBasedOnLDLPoints(0.17f);
            return 0.17f;
        }

        if (totalPoints == 14) {
            patient.setCHDRiskBasedOnLDLPoints(0.20f);
            return 0.20f;
        }

        if (totalPoints == 15) {
            patient.setCHDRiskBasedOnLDLPoints(0.24f);
            return 0.24f;
        }
        if (totalPoints == 16) {
            patient.setCHDRiskBasedOnLDLPoints(0.27f);
            return 0.27f;
        }
        if (totalPoints == 17) {
            patient.setCHDRiskBasedOnLDLPoints(0.32f);
            return 0.32f;
        }
 
        return 0.32f;
            
        }

        return calculateCHDRiskBasedOnLDLPointsForFemalePatient(patient);
    }*/

  /*  public float calculateCHDRiskBasedOnCholestrolPointsForFemalePatient(Patient patient) {
        if (patient.getGender() == Person.Gender.Female) {
            
        int totalPoints = calculateMaleCholestrolPoints(patient);

        if (totalPoints < -2) {
            patient.setCHDRiskBasedOnLDLPoints(0.01f);
            return 0.01f;
        }
        if (totalPoints == -1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }
        if (totalPoints == 0) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 1) {
            patient.setCHDRiskBasedOnLDLPoints(0.02f);
            return 0.02f;
        }

        if (totalPoints == 2) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 3) {
            patient.setCHDRiskBasedOnLDLPoints(0.03f);
            return 0.03f;
        }

        if (totalPoints == 4) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 5) {
            patient.setCHDRiskBasedOnLDLPoints(0.04f);
            return 0.04f;
        }

        if (totalPoints == 6) {
            patient.setCHDRiskBasedOnLDLPoints(0.05f);
            return 0.05f;
        }

        if (totalPoints == 7) {
            patient.setCHDRiskBasedOnLDLPoints(0.06f);
            return 0.06f;
        }

        if (totalPoints == 8) {
            patient.setCHDRiskBasedOnLDLPoints(0.07f);
            return 0.07f;
        }

        if (totalPoints == 9) {
            patient.setCHDRiskBasedOnLDLPoints(0.08f);
            return 0.08f;
        }

        if (totalPoints == 10) {
            patient.setCHDRiskBasedOnLDLPoints(0.10f);
            return 0.10f;
        }

        if (totalPoints == 11) {
            patient.setCHDRiskBasedOnLDLPoints(0.11f);
            return 0.11f;
        }

        if (totalPoints == 12) {
            patient.setCHDRiskBasedOnLDLPoints(0.13f);
            return 0.13f;
        }

        if (totalPoints == 13) {
            patient.setCHDRiskBasedOnLDLPoints(0.15f);
            return 0.15f;
        }

        if (totalPoints >= 14) {
            patient.setCHDRiskBasedOnLDLPoints(0.18f);
            return 0.18f;
        }
        if (totalPoints >= 15) {
            patient.setCHDRiskBasedOnLDLPoints(0.20f);
            return 0.20f;
        }
        if (totalPoints >= 16) {
            patient.setCHDRiskBasedOnLDLPoints(0.24f);
            return 0.24f;
        }
        if (totalPoints == 17) {
            patient.setCHDRiskBasedOnLDLPoints(0.27f);
            return 0.27f;
        }
        return 0.27f;
    }
            
        //return calculateCHDRiskBasedOnCholestrolPointsForFemalePatient(patient);
        return calculateCHDRiskBasedOnCholestrolPointsForFemalePatient(patient);

    }
<<<<<<< HEAD:Assignment5/src/assignment5/MaleHealthSystem.java

   */
  
=======
>>>>>>> 1909f87883af2b428ec900afb573b7e74a99be6a:Assignment5/src/assignment5/HealthSystem.java
    //Family level
    /*
    public float calculateAverageCHDRiskBasedOnLDLPointsForFamily(Family family) {
        float averageCHDRiskBasedonLDLPoints = 0.0f;
        int patientCount = 0;
        for (Person p : family.getMembersList()) {
            if (p instanceof Patient) {
                patientCount++;
                averageCHDRiskBasedonLDLPoints += calculateCHDRiskBasedOnLDLPointsForFemalePatient((Patient) p)+calculateCHDRiskBasedOnLDLPointsForMalePatient((Patient) p);
            }
        }
        return averageCHDRiskBasedonLDLPoints / patientCount;
    }
  

    public float calculateAverageCHDRiskBasedOnCholestrolPointsForFamily(Family family) {
        float averageCHDRiskBasedonCholestrolPoints = 0.0f;
        int patientCount = 0;
        for (Person p : family.getMembersList()) {
            if (p instanceof Patient) {
                patientCount++;
                averageCHDRiskBasedonCholestrolPoints += calculateCHDRiskBasedOnCholestrolPointsForFemalePatient((Patient) p)+calculateCHDRiskBasedOnCholestrolPointsForFemalePatient((Patient) p);
            }
        }
        return averageCHDRiskBasedonCholestrolPoints / patientCount;
    }

    //Commiunity level
    
    public float calculateAverageCHDRiskBasedOnLDLPointsForCommunity(Community community) {
        float averageCHDRiskBasedonLDLPoints = 0.0f;
        for (Family f : community.getFamilies()) {
            averageCHDRiskBasedonLDLPoints += calculateAverageCHDRiskBasedOnLDLPointsForFamily(f);
        }
        return averageCHDRiskBasedonLDLPoints / community.getFamilies().size();
    }

    public float calculateAverageCHDRiskBasedOnCholestrolPointsForCommunity(Community community) {
        float averageCHDRiskBasedonCholestrolPoints = 0.0f;
        for (Family f : community.getFamilies()) {
            averageCHDRiskBasedonCholestrolPoints += calculateAverageCHDRiskBasedOnCholestrolPointsForFamily(f);
        }
        return averageCHDRiskBasedonCholestrolPoints / community.getFamilies().size();
    }
    
    //City level

    public float calculateAverageCHDRiskBasedOnLDLPointsForCity(City city) {
        float averageCHDRiskBasedonLDLPoints = 0.0f;
        for (Community c : city.getCommunities()) {
            averageCHDRiskBasedonLDLPoints += calculateAverageCHDRiskBasedOnLDLPointsForCommunity(c);
        }
        return averageCHDRiskBasedonLDLPoints / city.getCommunities().size();
    }

    public float calculateAverageCHDRiskBasedOnCholestrolPointsForCity(City city) {
        float averageCHDRiskBasedonCholestrolPoints = 0.0f;
        for (Community c : city.getCommunities()) {
            averageCHDRiskBasedonCholestrolPoints += calculateAverageCHDRiskBasedOnCholestrolPointsForCommunity(c);
        }
        return averageCHDRiskBasedonCholestrolPoints / city.getCommunities().size();
    }
*/
}
