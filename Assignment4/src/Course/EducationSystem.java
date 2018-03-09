/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/*
if I want to have data manually
import educationsystem.InitializeFacultyList;
 */
import Faculty.InitializeFacultyList;
import Faculty.Faculty;
import Collage.Department;
import Collage.College;
import java.util.ArrayList;
import java.util.Scanner;//to be able to type input

/**
 *
 * @author MAC
 */
public class EducationSystem {

    private College college;

    public EducationSystem() {
        initialize();

    }

    private void initialize() {
        college = new College();
        Department informationSystems = new Department("Information Systems", InitializeFacultyList.initializeInformationSystemsFacultyDirectory());
        Department computerScience = new Department("Computer Science", InitializeFacultyList.initializeComputerScienceFacultyDirectory());
        Department physics = new Department("Physics", InitializeFacultyList.initializePhysicsFacultyDirectory());
        ArrayList<Department> departmentList = new ArrayList<>();
        departmentList.add(informationSystems);
        departmentList.add(computerScience);
        departmentList.add(physics);
        college.setDepartments(departmentList);
    }

    /**
     * @param args the command line arguments
     */
    public void printDepartmentInfo() {
        for (Department department : college.getDepartments()) {
            System.out.println(department.getName() + ":");
            for (Faculty faculty : department.getFacultyDirectory().getFacultyList()) {
                System.out.println("Faculty Name: " + faculty.getName() + '\t'
                        + "Rank: " + faculty.getRank() + '\t'
                        + "Overall Quality: " + faculty.getRating().getOverallQuality() + '\t'
                        + "Difficulty Level: " + faculty.getRating().getDifficultyLevel());
            }
        }
    }



}
