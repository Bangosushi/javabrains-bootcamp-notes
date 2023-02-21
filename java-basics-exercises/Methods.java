package session3;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String word = "Edoardo";
        int vowels = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> vowels++;
                default -> {}
            }
        }
        System.out.println("Number of vowels: " + vowels);
    }
}
