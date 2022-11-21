package E15Methods;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        printCharactersInRange(firstChar, secondChar);
    }

    public static void printCharactersInRange (char firstChar, char secondChar) {
        char startChar = ' ';
        char endChar = ' ';
        if (firstChar < secondChar) {
            startChar = firstChar;
            endChar = secondChar;
        } else {
            startChar = secondChar;
            endChar = firstChar;
        }

        for (char i = (char)(startChar + 1); i < endChar ; i++) {

            System.out.print(i + " ");
        }
    }
}
