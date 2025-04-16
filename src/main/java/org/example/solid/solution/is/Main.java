package org.example.solid.solution.is;

public class Main {
    public static void main(String[] args) {
        Eatable eatable = new Human();
        eatable.eat();
    }
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    @Override public void work() {
        System.out.println("Human working...");
    }

    @Override public void eat() {
        System.out.println("Human eating...");
    }
}

class Robot implements Workable {

    @Override public void work() {
        System.out.println("Robot working...");
    }
}