package session3.ObjectOrientedProgramming;

public class Bear extends Animal{

    String breed;

    public Bear(String name, int weight, int age, String breed) {
        super(name, weight, age);
        this.breed = breed;
    }

    @Override
    void feed() {
        System.out.println("The " + breed + " bear hibernates.");
    }
}
