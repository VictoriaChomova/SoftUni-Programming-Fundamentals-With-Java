package L05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 1;
        int oddNumCount = 0;
        while (oddNumCount < n) {
            if (currentNum % 2 != 0) {
                System.out.println(currentNum);
                sum += currentNum;
                oddNumCount++;
            }
            currentNum++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
