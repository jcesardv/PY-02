package org.example.solid;

// -> Bird Case
public class LiskovSubstitutionScenario {

    public static void main(String[] args) {
        letBirdFly(new Ostrich());
    }

    public static void letBirdFly(Bird bird) {
        bird.fly();
    }
}
