package session3;

public class BasicSyntax {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 7;
        sum(num1,num2);
        difference(num1,num2);
        product(num1,num2);
        quotient(num1,num2);
    }

    public static void sum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
    public static void difference(int x, int y) {
        System.out.println("Difference: " + (x-y));
    }
    public static void product(int x, int y) {
        System.out.println("Product: " + (x*y));
    }
    public static void quotient(int x, int y) {
        System.out.println("Quotient: " + (x/y));
    }
}
