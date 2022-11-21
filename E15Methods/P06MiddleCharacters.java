package E15Methods;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacters(input);
    }

    public static void printMiddleCharacters(String input) {
        if (input.length() % 2 == 0) {

            System.out.println("" + input.charAt(input.length()/2 - 1) + input.charAt(input.length()/2));
        } else {
            System.out.println("" + input.charAt(input.length()/2));
        }
    }
}
