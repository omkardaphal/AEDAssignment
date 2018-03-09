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
public class Faculty {

    //private String id;
    private String name;
    private Rating rating;
    private ArrayList<CourseOffering> courseOfferings; // stores course offering ID

    public Faculty() {
        rating = new Rating(0, 0);
        courseOfferings = new ArrayList<>();
    }

    enum Rank {
        Assistant, Associate, Full;
    }

    private Rank rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    Rank getRank() {
        return rank;
    }

    void setRank(Rank rank) {
        this.rank = rank;
    }

    /*
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     */
    ArrayList<CourseOffering> getCourseOfferings() {
        return courseOfferings;
    }

    void setCourseOfferings(ArrayList<CourseOffering> courseOfferings) {
        this.courseOfferings = courseOfferings;
    }

    Rating getRating() {
        return rating;
    }

    void setRating() {
        double overallQuality = 0;
        double difficultyLevel = 0;
        for (CourseOffering courseOffering : courseOfferings) {
            overallQuality += courseOffering.getFacultyRating().getOverallQuality();
            difficultyLevel += courseOffering.getFacultyRating().getDifficultyLevel();
        }
        rating.setOverallQuality(overallQuality / courseOfferings.size());
        rating.setDifficultyLevel(difficultyLevel / courseOfferings.size());
    }

    public void saying() {
    }
}
