package session3;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] listOfInts = {0,-2,4,7,10};
        System.out.println(Arrays.stream(listOfInts).max().getAsInt());
    }
}
