package session3.ObjectOrientedProgramming;

public class Lion extends Animal{

    String gender;

    public Lion(String name, int weight, int age, String gender) {
        super(name, weight, age);
        this.gender = gender;
    }

    @Override
    void feed() {
        System.out.println("The " + gender + " lion roars.");
    }
}
