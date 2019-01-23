/*
 * File: Constraint.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment: P1
 * Vers: 1.0.0 01/22/2019 crd - initial coding
 */

/**
 * Generic Constraint
 * @author Collin Davis
 */
public class Constraint {
    
    // Instance Variables
    public String title;
    
    /**
    * Create a constraint with a UID and a name. If name is null,
    *       then "Unnamed constraint" shall be used for the
    *       name of the constraint.
    * @param title text for title.
    */
    public Constraint(String title) {
        this.title = title;
    }
    
    /**
     * Get the UID for the sensor CO-{number}
     * 
     * @return constraint UID
     */
    public String getUID() {
        // add functionality
    }
    
    /**
     * Get the title of the constraint
     * 
     * @return title text of the title for this constraint
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * returns the string "{UID}: {title}"
     * example: <code>CO-01: System shall be implemented in Java.</code>
     * 
     * @return formatted string
     */
    public String toString() {
        // add functionality
    }
    
    /**
     * Set (change) the title of a constraint. If the new title is null,
     *      the title will NOT change.
     * 
     * @param title text for title
     */
    public void setTitle(String title) {
        // add functionality
    }
}
