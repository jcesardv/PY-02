package org.example.solid.scenario.ls;

// -> Bird Case
public class BirdCase {

    public static void main(String[] args) {
        letBirdFly(new Ostrich());
    }

    public static void letBirdFly(Bird bird) {
        bird.fly();
    }
}
