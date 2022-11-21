package E08DataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfChars = 0;
        for (int i = 1; i <= n; i++) {
            char letter = scanner.nextLine().charAt(0);
            sumOfChars += (int)letter;
        }
        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
