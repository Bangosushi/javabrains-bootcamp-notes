package session3;

public class ControlStructures {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(numberSign(number));
        number = 0;
        System.out.println(numberSign(number));
        number = -1;
        System.out.println(numberSign(number));
    }

    public static String numberSign(int x) {
        if (x == 0) return "The number is zero";
        return (x < 0) ?  "The number is negative" :  "The number is positive";
    }
}
