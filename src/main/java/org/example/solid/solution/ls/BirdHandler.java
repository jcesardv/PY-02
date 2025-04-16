package org.example.solid.solution.ls;

public class BirdHandler {

    public static void main(String[] args) {
        letItFly(new Sparrow());
    }

    public static void letItFly(FlyingBird bird) {
        bird.fly();
    }
}

abstract class Bird {
    public abstract void eat();
}

abstract class FlyingBird extends Bird {
    public abstract void fly();
}

class Sparrow extends FlyingBird {

    @Override public void eat() {
        System.out.println("Sparrow eat seeds.");
    }

    @Override public void fly() {
        System.out.println("Sparrow flies.");
    }
}

class Ostrich extends Bird {

    @Override public void eat() {
        System.out.println("Ostrich eats plants.");
    }
}