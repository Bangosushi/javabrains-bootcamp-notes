package session3.ObjectOrientedProgramming;

public class Tiger extends Animal {

    int stripes;

    public Tiger(String name, int weight, int age, int stripes) {
        super(name, weight, age);
        this.stripes = stripes;
    }

    @Override
    void feed() {
        if (stripes > 0) {
            System.out.println("The tiger with " + stripes + " stripes pounces.");
        } else {
            System.out.println("The tiger without stripes pounces.");
        }
    }
}
