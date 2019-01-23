/*
 * File: Project.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment: P1
 * Vers: 1.0.0 01/22/2019 crd - initial coding
 */

/**
 * Generic Project
 * @author Collin Davis crdavis2@uab.edu
 */
public class Project {
    
    // instance variables
    public String name;    
    
    /**
     * Constructor for objects of class Project with name
    
     * @param name text for title. If null, the project title will
     *      be set to "Unnamed project"
     */
    public Project(String name) {
        this.name = name;
    }
    
    /**
     * Get the name of the project
     * 
     * @return the text of the project name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get the next goal if it exists. The first time called, it will return the
     * first goal. The method <code>reset()</code> will reset the object such that
     * it will return the first goal on the next invocation of
     * <code>getNextGoal()</code> after the <code>reset()</code>.
     *
     * The order of the goals will be the ordered they were added to the object.
     * @return goal object if one exists or null otherwise
     */
    public Goal getNextGoal() {
        // add functionality
    }
    
    /**
    * Get the next constraint if it exists. The first time called, it will return
    * the first constraint. The method <code>reset()</code> will reset the object
    * such that it will return the first constraint on the next invocation of
    * <code>getNextConstraint()</code> after the <code>reset()</code>.
    * @return constraint object if one exists or null otherwise
    */
    public Constraint getNextConstraint() {
        // add functionality
    }
    
    /**
     * Get the next risk if it exists in priority order. The first time called, it
     * will return the highest priority risk. The method <code>reset()</code> will
     * reset the object such that it will return the first risk on the next
     * invocation of <code>getNextRisk()</code> after the <code>reset()</code>.
     * @return risk object if one exists or null otherwise
     */
    public Risk getNextRisk() {
        // add functionality
    }
    
    /**
     * Add constraint to the project
     * 
     * @constraint the constraint to add to the project
     */
    public String addConstraint() {
        // add functionality
    }
    
    /**
     * Add goal to the project
     * 
     * @param goal the goal to add to the project
     */
    public String addGoal() {
        // add functionality
    }
    
    /**
     * Add risk to the project
     * 
     * @param risk the risk to add to the project
     */
    public String addRisk() {
        // add functionality
    }
    
    /**
     * Reset the getNextGoal, getNextConstraint, getNextRisk behaviors to start
     *      again at the "first" item to allow sequencing through the list again
     */
    public String reset() {
        // add functionality
    }
    
}
