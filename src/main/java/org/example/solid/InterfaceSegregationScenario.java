package org.example.solid;

// -> Robot
public class InterfaceSegregationScenario implements Worker {

 public void work() {
     System.out.println("Robot working...");
 }

 public void eat() {
     // Los robots no comen
     throw new UnsupportedOperationException("Robots don't eat");
 }
}
