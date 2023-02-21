package session3.ObjectOrientedProgramming;

public abstract class Animal {
    String name;
    int weight;
    int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    abstract void feed();
}
