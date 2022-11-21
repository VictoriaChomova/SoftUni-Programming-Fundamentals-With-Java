package E15Methods;

import java.util.Scanner;

public class P10TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isSumDivisibleBy8(i) && doesConsistOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSumDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            sum += currentDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean doesConsistOddDigit(int number) {
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
