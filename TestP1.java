/*
 * File: TestP1.java
 * Author: David G. Green DGreen@uab.edu
 * Assignment:  2019-1SpringP1toP3 - EE333 Spring 2019
 * Vers: 1.0.0 01/14/2019 dgg - initial coding
  */

/**
 * Exercise models in P1
 * @author David G. Green DGreen@uab.edu
 */
public class TestP1 {
    
    public static void main(String[] args) {
       
        Goal g1       = new Goal("g1");
        Goal g2       = new Goal("g2");
        Goal g3       = new Goal("g3");
        
        Constraint c1 = new Constraint("c1");
        Constraint c2 = new Constraint("c2");
        Constraint c3 = new Constraint("c3");
        
        Risk       r1 = new Risk("r1");
        Risk       r2 = new Risk("r2");
        Risk       r3 = new Risk("r3");
        
        Project    p1 = new Project("p1");
        
        println("g1 then c1 then r1 then p1 without anything more than constructor");
        println(g1);
        println(c1);
        println(r1);
        println(p1);
        
        r1.setImpact(5);
        r1.setLikelihood(3);
        r1.setMitigation("Failure, not highest priority");
        
        printEval( r1.priority() == 15, "r1 priority" );
        println("r1 priority: " + r1.priority());
        
        r2.setImpact(5);
        r2.setLikelihood(10);
        r2.setMitigation("Success if on top");
        
        printEval( r2.priority() == 45, "r2 priority" );
        println("r2 priority: " + r2.priority());
        
        p1.addConstraint(c1);
        p1.addGoal(g1);
        p1.addRisk(r1);
        
        println(p1);
        
        p1.addRisk(r2);        
        println(p1);
        println(p1.getNextRisk());
        println(p1.getNextRisk());
        if (p1.getNextRisk() != null) {
            println("getNextRisk failure");
        }
        
        p1.reset();
        println(p1.getNextRisk().getMitigation());
        
        Project p2 = new Project("p2");
        
        for (int i = 0; i < 11; i++) {
            p2.addConstraint(new Constraint("cc" + i));
            p2.addGoal(      new Goal(      "gg" + i));
            p2.addRisk(      new Risk(      "rr" + i));
            println(p2);
        }
    }


    
    
    // Convenience functions
    private static void println(Object o) {
        System.out.println(o.toString());
    }
    
    private static void printEval( boolean success, String s) {
        String prefix = "Failed: ";
        if (success) {
            prefix = "Success: ";
        }
        System.out.println(prefix + s);
    }

}
