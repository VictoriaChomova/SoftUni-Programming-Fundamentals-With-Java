package E15Methods;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        printVowels(input);
    }

    public static void printVowels(String text) {
        int vowelsCount = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'o' || currentLetter == 'e' || currentLetter == 'u' || currentLetter == 'i') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
