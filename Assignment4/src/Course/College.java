/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author MAC
 */
public class College {

    private ArrayList<Department> departments;
    Department Department;

    public College() {
        this.departments =  new ArrayList<>();
    }
    
    

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public Department getDepartment() {
        return Department;
    }
    
      public Department addDepartment(){
Department department = new Department();
departments.add(department);

return department;

}
    
    
}
