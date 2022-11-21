package E15Methods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        printDivision(calculateFactorialOfNum(firstNum), calculateFactorialOfNum(secondNum));
    }

    public static long calculateFactorialOfNum(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void printDivision(long firstNumber, long secondNumber) {
        System.out.printf("%.2f", firstNumber * 1.0 / secondNumber);
    }
}
