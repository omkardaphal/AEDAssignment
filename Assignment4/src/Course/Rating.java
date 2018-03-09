/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author MAC
 */
class Rating {

    private double difficultyLevel;  //in 0-4 scale
    private double overallQuality;   //in 0-4 scale

    public Rating(double difficultyLevel, double overallQuality) {
        this.difficultyLevel = difficultyLevel;
        this.overallQuality = overallQuality;
    }
    
    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public double getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(double overallQuality) {
        this.overallQuality = overallQuality;
    }

}
