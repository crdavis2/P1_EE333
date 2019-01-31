/*
 * File: Risk.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment: P1
 * Vers: 1.0.0 01/22/2019 crd - initial coding
 */

/**
 * Generic Risk
 * @author Collin Davis crdavis2@uab.edu
 */
public class Risk {
    
    // Instance Variables
    private String     title;           // title of Risk
    private String     UID;             // Unique ID for each Risk
    private String     mitigation;      // action to reduce Risk
    private static int riskCount = 1;   // used to generate UID
    private int        impact;          // measure of severity of Risk
    private int        likelihood;      // measure of certainty that a Risk will happen
    private int        priority;        // product of impact and likelihood
    
    
    /**
    * Create a risk with a UID and a title. If title is null, then "Unnamed 
    * risk" shall be used for the title of the risk. The other properties are   
    * set to legal values like 0, "" such that the Risk object
    * valid values at all time.
    * 
    * @param title text for risk
    */
    public Risk(String title) {
        if (title == null) {
            this.title = "Unnamed risk";
            UID = "RI-" + riskCount;
            riskCount++;
        } else {
            this.title = title;
            UID = "RI-" + riskCount;
            riskCount++;
        }
    }
    
    /**
    * Get the UID for the sensor RI-{number>}
    * 
    * @return risk UID
    */
    public String getUID() {
        return UID;
    }
    
    /**
    * Get title of the risk
    * 
    * @return title
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * Returns the string “{UID}: {title}”
    * Example: <code>RI-01: Computer crash .</code>
    * 
    * @return formatted string
    */
    @Override
    public String toString() {
        return UID + ": " + title;
    }
    
    /**
    * Get impact of risk if it happens 0-9 with 9 most severe
    * 
    * @return int impact value
    */
    public int getImpact() {
        return impact;
    }
    
    /**
    * Get likelihood of risk occurring 0-9 with 9 being most likely
    * 
    * @return int likelihood value
    */
    public int getLikelihood() {
        return likelihood;
    }
    
    /**
    * Get priority of risk (product of impact and likelihood) where larger is 
    * higher priority
    * 
    * @return int priority value
    */
    public int priority() {
        priority = impact * likelihood;
        return priority;
    }
    
    /**
    * Get mitigation (description of what will be done to mitigate the risk)
    * 
    * @return String text of mitigation description
    */
    public String getMitigation() {
        return mitigation;
    }
    
    /**
    * Set (change) the title of a risk. If the new title is null, the title will 
    * NOT change.
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
    
    /**
    * Set (change) the impact of the risk if it happens. Bounding between 0 
    * and 9 enforced so that, as examples, -1 would be saved as 0 and 220 
    * would be saved as 9.
    * 
    * @param value new impact value 0-9 with 9 most severe
    */
    public void setImpact(int value) {
        if (value <= 0) {
            impact = 0;
        } else if (value >= 9) {
            impact = 9;
        } else {
            impact = value;
        }
    }
    
    /**
    * Set (change) the likelihood of the risk happening. Bounding between 0 
    * and 9 enforced so that, as examples, -1 would be saved as 0 and 220 
    * would be saved as 9.
    * 
    * @param value new likelihood value 0-9 with 9 most severe
    */
    public void setLikelihood(int value) {
        if (value <= 0) {
            likelihood = 0;
        } else if (value >= 9) {
            likelihood = 9;
        } else {
            likelihood = value;
        }
    }
    
    /**
    * Set (or change) risk mitigation text (description of what will be done 
    * to mitigate the risk)
    * If new text is null, the text will NOT change.
    * 
    * @param text new risk mitigation text
    */
    public void setMitigation(String text) {
        if (text != null) {
            mitigation = text;
        } else {
            // title does not change
        }
    }
                
}
