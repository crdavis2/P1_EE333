/*
 * File: Risk.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment: P1
 * Vers: 1.0.0 01/22/2019 crd - initial coding
 */

/**
 * Generic Risk
 * @author Collin Davis
 */
public class Risk {
    
    /**
    * Create a risk with a UID and a title. If title is null, then "Unnamed 
    *   risk" shall be used for the title of the risk. The other properties are   
    *   set to legal values like 0, "" such that the Risk object
    * valid values at all time.
    */
    public Risk(String title) {
        // add functionality
    }
    
    /**
    * Get the UID for the sensor RI-{number>}
    * @return risk UID
    */
    public String getUID() {
        // add functionality
    }
    
    /**
    * Get title of the risk
    * @return title
    */
    public String getTitle() {
        // add functionality
    }
    
    /**
    * Returns the string “{UID}: {title}”
    * Example: <code>RI-01: Computer crash .</code>
    * @return formatted string
    */
    public String toString() {
        // add functionality
    }
    
    /**
    * Get impact of risk if it happens 0-9 with 9 most severe
    * @return int impact value
    */
    public int getImpact() {
        // add functionality
    }
    
    /**
    * Get likelihood of risk occurring 0-9 with 9 being most likely
    * @return int likelihood value
    */
    public int getLikelihood() {
        // add functionality
    }
    
    /**
    * Get priority of risk (product of severity and likelihood) where larger is 
    *   higher priority
    * @return int priority value
    */
    public int priority() {
        // add functionality
    }
    
    /**
    * Get mitigation (description of what will be done to mitigate the risk)
    * @return String text of mitigation description
    */
    public String getMitigation() {
        // add functionality
    }
    
    /**
    * Set (change) the title of a risk. If the new title is null, the title will 
    *   NOT change.
    * @param title text for title
    */
    public void setTitle(String title) {
        // add functionality
    }
    
    /**
    * Set (change) the impact of the risk if it happens. Bounding between 0 
    *   and 9 enforced so that, as examples, -1 would be saved as 0 and 220 
    *   would be saved as 9.
    * @param value new impact value 0-9 with 9 most severe
    */
    public void setImpact(int value) {
        // add functionality
    }
    
    /**
    * Set (change) the likelihood of the risk happening. Bounding between 0 
    * and 9 enforced so that, as examples, -1 would be saved as 0 and 220 
    * would be saved as 9.
    * @param value new likelihood value 0-9 with 9 most severe
    */
    public void setLikelihood(int value) {
        // add functionality
    }
    
    /**
    * Set (or change) risk mitigation text (description of what will be done 
    * to mitigate the risk)
    * If new text is null, the text will NOT change.
    * @param text new risk mitigation text
    */
    public void setMitigation(String text) {
        // add functionality
    }
                
}
