
package Employment;

import java.util.*;
/**
 *
 * @author lenovo
 */
public class EmploymentRecord {
    
    private String CompanyName;
    private String jobTitle;
    private String jobDescription;
    private Calendar dateStarted;
    private Calendar dateFinished;

    

    public EmploymentRecord(String CompanyName, String jobTitle, String jobDescription, Calendar dateStarted, Calendar dateFinished) {
        this.CompanyName = CompanyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.dateStarted = dateStarted;
        this.dateFinished = dateFinished;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public Calendar getDateStarted() {
        return dateStarted;
    }

    public Calendar getDateFinished() {
        return dateFinished;
    }

   
    
    
}
