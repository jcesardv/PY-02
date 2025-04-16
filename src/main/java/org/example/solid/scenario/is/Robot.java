package org.example.solid.scenario.is;

public class Robot implements Worker {

 public void work() {
     System.out.println("Robot working...");
 }

 public void eat() {
     // Los robots no comen
     throw new UnsupportedOperationException("Robots don't eat");
 }
}
