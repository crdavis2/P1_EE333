/*
 * File: Goal.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment: P1
 * Vers: 1.0.0 01/22/2019 crd - initial coding
 */

/**
 * Generic Goal
 * @author Collin Davis crdavis2@uab.edu
 */
public class Goal {
    
    // Instance Variables
    private String     title;           // title of Goal
    private String     UID;             // Unique ID for each Goal
    private static int goalCount = 1;   // used to generate UID
    
    
    
    
    /**
     * Create a goal with a UID and a title. If the title is null, then "Unnamed
     * goal" shall be used for the title of the goal.
     * 
     * @param title text for goal
     */
    public Goal(String title) {
        if (title == null) {
            this.title = "Unnamed goal";
            UID = "GO-" + goalCount;
            goalCount++;
        } else {
            this.title = title;
            UID = "GO-" + goalCount;
            goalCount++;
        }
    }
    
    
    /**
    * Get the UID for the sensor CO-{number}
    * 
    * @return goal UID
    */
    public String getUID() {
        return UID;
    }
    
    /**
    * Get title of the goal
    * 
    * @return text title
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * Return the string “{UID}: {title}”
    * Example: <code>GO-01: System shall be easy to implement.</code>
    * 
    * @return formatted string
    */
    @Override
    public String toString() {
        return UID + ": " + title;
    }
    
    /**
     * Set (change) the title of a goal. If the new title is null,
     * the title will NOT change.
     * 
     * @param title text for title
     */
    public void setTitle(String title) {
        if (this.title != null) {
            title = this.title;
        } else {
            // title does not change
        }
    }
}
