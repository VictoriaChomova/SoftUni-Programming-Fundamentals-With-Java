package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String num = Integer.toString(number);
        int sum = 0;
        int currentNum = number;

        for (int i = 1; i <= num.length(); i++) {
            int digit = currentNum % 10;
            currentNum = currentNum / 10;
            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial = factorial * j;
            }
            sum += factorial;
        }
        if (sum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
