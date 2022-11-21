package E08DataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number != 0) {
            int currentDigit = number % 10;
            sum += currentDigit;
            number = number / 10;
        }

        System.out.println(sum);

    }
}
