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

    // Instance Variables
    private static final int MAX_CONSTRAINTS       = 10;
    private static final int MAX_GOALS             = 10;
    private static final int MAX_RISKS             = 10;
    private String           title;
    private Constraint[]     constraints;
    private Goal[]           goals;
    private Risk[]           risks;
    private int              ConstraintCounter     =  0;
    private int              GoalCounter           =  0;
    private int              RiskCounter           =  0;
    private int              numGoals              =  0;
    private int              numConstraints        =  0;
    private int              numRisks              =  0;

    /**
     * Constructor for objects of class Project with title

     * @param title text for title. If null, the project title will
     *      be set to "Unnamed project"
     */
    public Project(String title) {
        if (title == null) {
            this.title = "Unnamed project";
            constraints = new Constraint[MAX_CONSTRAINTS];
            goals = new Goal[MAX_GOALS];
            risks = new Risk[MAX_RISKS];
        } else {
            this.title = title;
            constraints = new Constraint[MAX_CONSTRAINTS];
            goals = new Goal[MAX_GOALS];
            risks = new Risk[MAX_RISKS];
        }

    }

    /**
     * Get the title of the project
     *
     * @return the text of the project title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Represent a text description of the project like {title} with {#constraints}
     *  constraints, {#goals}, and {#risks} risks.
     * @return string as described
     */
    @Override
    public String toString() {
        return title + " " + numConstraints + " Constraints " + numGoals +
                " Goals " + numRisks + " Risks";
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
        if (GoalCounter < MAX_GOALS) {
            GoalCounter++;
            return goals[GoalCounter];
        } else {
            return null;
        }
    }

    /**
    * Get the next constraint if it exists. The first time called, it will return
    * the first constraint. The method <code>reset()</code> will reset the object
    * such that it will return the first constraint on the next invocation of
    * <code>getNextConstraint()</code> after the <code>reset()</code>.
    * @return constraint object if one exists or null otherwise
    */
    public Constraint getNextConstraint() {
        if (ConstraintCounter < MAX_CONSTRAINTS) {
            ConstraintCounter++;
            return constraints[ConstraintCounter];
        } else {
            return null;
        }
    }

    /**
     * Get the next risk if it exists in priority order. The first time called, it
     * will return the highest priority risk. The method <code>reset()</code> will
     * reset the object such that it will return the first risk on the next
     * invocation of <code>getNextRisk()</code> after the <code>reset()</code>.
     * @return risk object if one exists or null otherwise
     */
    public Risk getNextRisk() {
        if (RiskCounter == 0) {
            sort(risks, 0, numRisks - 1);
        }
        if (RiskCounter <= MAX_RISKS) {
            RiskCounter++;
            return risks[RiskCounter - 1];
        } else {
            return null;
        }
    }

    /**
     * Add constraint to the project
     *
     * @param constraint the constraint to add to the project
     */
    public void addConstraint(Constraint constraint) {
        if (numConstraints < MAX_CONSTRAINTS) {
            constraints[numConstraints] = constraint;
            numConstraints++;
        } else {
            // some error handling goes here
        }
    }

    /**
     * Add goal to the project
     *
     * @param goal the goal to add to the project
     */
    public void addGoal(Goal goal) {
        if (numGoals < MAX_GOALS) {
            goals[numGoals] = goal;
            numGoals++;
        } else {
            // some error handling goes here
        }
    }

    /**
     * Add risk to the project
     *
     * @param risk the risk to add to the project
     */
    public void addRisk(Risk risk) {
        if (numRisks < MAX_RISKS) {
            risks[numRisks] = risk;
            numRisks++;
        } else {
            // some error handling goes here
        }
    }

    /**
     * Reset the getNextGoal, getNextConstraint, getNextRisk behaviors to start
     *      again at the "first" item to allow sequencing through the list again
     */
    public void reset() {
        GoalCounter       = 0;
        RiskCounter       = 0;
        ConstraintCounter = 0;
    }

    /**
     * Take collection of risks and sort from max to min
     * @param arr array of risks collected
     * @param l
     * @param m
     * @param r 
     */
     private void merge(Risk[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        Risk[] L = new Risk[n1];
        Risk[] R = new Risk[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].priority() > R[j].priority()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

     /**
      * Take collection of risks and sort from max to min
      * @param arr
      * @param l
      * @param r 
      */
    private void sort(Risk[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}