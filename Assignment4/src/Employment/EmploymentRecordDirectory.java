/*
 * This Class has an arraylist which contains all student's work history from the day he started working. 
 * Students might have been working for different companies,
and the best way to have this record is to follow up with a student's work history is to create a work directory.
 */
package Employment;

import java.util.*;
import studentsInfo.Student;
/**
 *
 * @author lenovo
 */
public class EmploymentRecordDirectory {
    
    private ArrayList<EmploymentRecord> employmentRecords;
    
   public EmploymentRecordDirectory()
   {
       employmentRecords=new ArrayList<EmploymentRecord>();
   }

    public ArrayList<EmploymentRecord> getEmploymentRecords() {
        return employmentRecords;
    }

    public void setEmploymentRecords(ArrayList<EmploymentRecord> employmentRecords) {
        this.employmentRecords = employmentRecords;
    }
   
    //Add and employment records. In other words, add a student's new job information.
    public void addEmploymentRecord(EmploymentRecord employmentRecord)
    {
        employmentRecords.add(employmentRecord);
    }

    
    
}
