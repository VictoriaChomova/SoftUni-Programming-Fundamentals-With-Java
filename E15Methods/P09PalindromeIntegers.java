package E15Methods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
         while (!input.equals("END")) {

             System.out.println(isPalindromeInteger(input));

             input = scanner.nextLine();
         }
    }

    public static boolean isPalindromeInteger (String input) {
        String newNumber = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            newNumber += input.charAt(i);
        }
        if (input.equals(newNumber)){
            return true;
        } else {
            return false;
        }
    }
}
