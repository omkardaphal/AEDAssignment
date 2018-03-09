package assignment4;



import Course.EducationSystem;
import java.util.Scanner;
import studentsInfo.*;



/**
 *
 * @author lenovo
 */
public class Assignment4 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EducationSystem educationSystems = new EducationSystem();
        
        
        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.DEPARTMENT LEVEL REPORTS");
        System.out.println("2.COLLEGE LEVEL REPORTS");
   

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for department level reports");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
           
        if (choice == 1)
        {
            System.out.println("Enter 1 for Overall department's GPA report ");
            System.out.println("Enter 2 for department's 1Faculty report ");
        }
            int choic = reader.nextInt();

            
                switch (choice) {
            case 1:
                switch (choic){
                      case 1:
               System.out.println("***************DEPARTMENT LEVEL REPORTS STARTS******************");
               System.out.println("1.GPA");
        for (Student st:InitializeStudents.InitializeStudent().getStudents() )
        {
         System.out.println("Calculate GPA of "+" "+st.getStudentId() +" "+st.getFirstName()+" "+st.getLastName());
         System.out.println(st.getGpa());
        System.out.println("..........................................................................");
         
                      }  break;
                      case 2:
        educationSystems.printDepartmentInfo();break;
                 
}break;
                 
            case 2: 
                System.out.println("***************COLLEGE LEVEL REPORTS STARTS******************");
                  for (Student st:InitializeStudents.InitializeStudent().getStudents() )
        {
         System.out.println(" "+st.getStudentId() +" "+st.getFirstName()+" "+st.getLastName());
         
  for(int j=0; j<st.getEmploymentRecords().getEmploymentRecords().size(); j++)
            {
        System.out.println("Company's Name: "+st.getEmploymentRecords().getEmploymentRecords().get(j).getCompanyName());
        System.out.println("Company's Date: "+st.getEmploymentRecords().getEmploymentRecords().get(j).getDateStarted().getTime());     
            
         } 
            System.out.println("--------------------------------------------");
        }
                System.out.println("Number of Students have been employed: ");
      System.out.println("("+InitializeStudents.InitializeStudent().numberOfStudentEmployed()+") Student");
    
                System.out.println("***************COLLEGE LEVEL REPORT ENDS******************");
                break;
        }
        
        
        
        
      
    
    
    }
    
}

