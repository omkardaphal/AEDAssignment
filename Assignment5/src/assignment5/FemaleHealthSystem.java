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
public class FemaleHealthSystem {
    
    // Age Female Step 1
    public int calculateFemaleLDLPointsForAge(int age) {
        
        if (age >= 30 && age <= 34) {
            return -9;
        }
        else if (age >= 35 && age <= 39) {
            return -4;
        }
        else if (age >= 40 && age <= 44) {
            return 0;
        }
        else if (age >= 45 && age <= 49) {
            return 3;
        }
        else if (age >= 50 && age <= 54) {
            return 6;
        }
        else if (age >= 55 && age <= 59) {
            return 7;
        }
        else if (age >= 60 && age <= 64) {
            return 8;
        }
        else if (age >= 65 && age <= 69) {
            return 8;
        }
        else if (age >= 70 && age <= 74) {
            return 8;
        }
        else
            return -5;
    }

    public int calculateFemaleCholestrolPointsForAge(int age) {
    
        if (age >= 30 && age <= 34) {
            return -9;
        }
        else if (age >= 35 && age <= 39) {
            return -4;
        }
        else if (age >= 40 && age <= 44) {
            return 0;
        }
        else if (age >= 45 && age <= 49) {
            return 3;
        }
        else if (age >= 50 && age <= 54) {
            return 6;
        }
        else if (age >= 55 && age <= 59) {
            return 7;
        }
        else if (age >= 60 && age <= 64) {
            return 8;
        }
        else if (age >= 65 && age <= 69) {
            return 8;
        }
        else if (age >= 70 && age <= 74) {
            return 8;
        }
        else 
            return -5;
    }
    
    //// LDL-C Female Step 2
    
     public int calculateFemaleLDLPointsForLDLC(float Ch) {
        float LDLCholestrol = Ch;
        if (LDLCholestrol < 100) {
            return -2;
        }
        else if (LDLCholestrol >= 100 && LDLCholestrol <= 129) {
            return 0;
        }
        else if (LDLCholestrol >= 130 && LDLCholestrol <= 159) {
            return 0;
        }
        else if (LDLCholestrol >= 160 && LDLCholestrol <= 190) {
            return 2;
        }
        else 
            return 2;
    }

    public int calculateFemaleCholestrolPointsForCholestrol(float Ch) {
        float cholestrol =Ch;
        if (cholestrol < 160) {
            return -2;
        }
        else if (cholestrol >= 160 && cholestrol <= 109) {
            return 0;
        }
        else if (cholestrol >= 200 && cholestrol <= 239) {
            return 1;
        }
        else if (cholestrol >= 240 && cholestrol <= 279) {
            return 1;
        }
        else 
            return 3;
    }
    
    // HDL-C Female Step 3
public int calculateFemaleLDLPointsForHDLC(float Ch) {
        float HDLCholestrol = Ch;
        if (HDLCholestrol < 35) {
            return 5;
        }
        else if (HDLCholestrol >= 35 && HDLCholestrol <= 44) {
            return 2;
        }
        else if (HDLCholestrol >= 45 && HDLCholestrol <= 49) {
            return 1;
        }
        else if (HDLCholestrol >= 50 && HDLCholestrol <= 59) {
            return 0;
        }
        else 
            return -2;
    }

    public int calculateFemaleCholestrolPointsForHDLC(float Ch) {
        float HDLCholestrol = Ch;
        if (HDLCholestrol < 35) {
            return 5;
        }
        else if (HDLCholestrol >= 35 && HDLCholestrol <= 44) {
            return 2;
        }
        else if (HDLCholestrol >= 45 && HDLCholestrol <= 49) {
            return 1;
        }
        else if (HDLCholestrol >= 50 && HDLCholestrol <= 59) {
            return 0;
        }
        else return -3;
    }
    
    //BP Female Step 4
     public int calculateFemalePointsForBloodPressure( int bp) {
        int dyastolic = bp;
  

        int pointsBasedOnDyastolic = 0, pointsBasedOnsystolic = 0;
        if (dyastolic < 80) {
            pointsBasedOnDyastolic = -3;
        }
        else if (dyastolic >= 80 && dyastolic <= 84) {
            pointsBasedOnDyastolic = 0;
        }
        else if (dyastolic >= 85 && dyastolic <= 89) {
            pointsBasedOnDyastolic = 0;
        }
        else if (dyastolic >= 90 && dyastolic <= 99) {
            pointsBasedOnDyastolic = 2;
        }
        else if (dyastolic >= 100) {
            pointsBasedOnDyastolic = 3;
        }

        

        return pointsBasedOnDyastolic;

    }
     
     //Diabetes Female Step 5
        public int calculateFemaleLDLPointsForDiabetes(String diabetes) {
       if(diabetes =="yes")
            return 4;
       else 
            return 0;
     }

    public int calculateFemaleCholestrolPointsForDiabetes(String diabetes) {
   if(diabetes =="yes")
            return 4;
       else 
            return 0;
     }
    
    //Smoker female step 6
 public int calculateFemaleLDLPointsForSmoker(String smoker) {
   if(smoker =="yes")
            return 2;
       else 
            return 0;
     }

    public int calculateFemaleCholestrolPointsForSmoker(String smoker) {
   if(smoker =="yes")
            return 2;
       else 
            return 0;
     }
<<<<<<< HEAD
 
    public float calculateCHDRiskBasedOnLDLPointsForFemalePatient(int femaleLDL) {
      //  if (patient.getGender() == Person.Gender.Female) {
            
        int totalPoints = femaleLDL;

        if (totalPoints < -2) {
            return 0.01f;
        }

        else if (totalPoints == -1) {
            return 0.02f;
        }

        else if (totalPoints == 0) {
            return 0.02f;
        }

        else if (totalPoints == 1) {
            return 0.02f;
        }

        else if (totalPoints == 2) {
            return 0.03f;
        }

        else if (totalPoints == 3) {
            return 0.03f;
        }

        else if (totalPoints == 4) {
            return 0.04f;
        }

        else if (totalPoints == 5) {
            return 0.05f;
        }

        else if (totalPoints == 6) {
            return 0.06f;
        }

        else if (totalPoints == 7) {
            return 0.07f;
        }

        else if (totalPoints == 8) {
            return 0.08f;
        }

        else if (totalPoints == 9) {
            return 0.09f;
        }

        else if (totalPoints == 10) {
            return 0.11f;
        }

        else if (totalPoints == 11) {
            return 0.13f;
        }

        else if (totalPoints == 12) {
            return 0.15f;
        }

        else if (totalPoints == 13) {
            return 0.17f;
        }

        else if (totalPoints == 14) {
            return 0.20f;
        }

        else if (totalPoints == 15) {
            return 0.24f;
        }
        else if (totalPoints == 16) {
            return 0.27f;
        }
        else
            
        return 0.32f;
            
        }


   public float calculateCHDRiskBasedOnCholestrolPointsForFemalePatient(int femaleChol) {
        //if (patient.getGender() == Person.Gender.Female) {
            
        int totalPoints = femaleChol;

        if (totalPoints < -2) {

            return 0.01f;
        }
        else if (totalPoints == -1) {
            return 0.02f;
        }
        else if (totalPoints == 0) {
            return 0.02f;
        }

        else if (totalPoints == 1) {
            return 0.02f;
        }

        else if (totalPoints == 2) {
            return 0.03f;
        }

        else if (totalPoints == 3) {
            return 0.03f;
        }

        else if (totalPoints == 4) {
            return 0.04f;
        }

        else if (totalPoints == 5) {
            return 0.04f;
        }

        else if (totalPoints == 6) {
            return 0.05f;
        }

        else if (totalPoints == 7) {
            return 0.06f;
        }

        else if (totalPoints == 8) {
            return 0.07f;
        }

        else if (totalPoints == 9) {
            return 0.08f;
        }

        else if (totalPoints == 10) {
            return 0.10f;
        }

        else if (totalPoints == 11) {
            return 0.11f;
        }

        else if (totalPoints == 12) {
            return 0.13f;
        }

        else if (totalPoints == 13) {
            return 0.15f;
        }

        else if (totalPoints >= 14) {
            return 0.18f;
        }
        else if (totalPoints >= 15) {
            return 0.20f;
        }
        else if (totalPoints >= 16) {
            return 0.24f;
        }
        else 
        return 0.27f;
}
            

    }

//}
=======
    
}
>>>>>>> 36505b48e2994d6c500e5f935221c684689d5a81
