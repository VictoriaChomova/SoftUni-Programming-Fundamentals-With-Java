package L14Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                printSum(num1, num2);
                break;
            case "subtract":
                printSubtraction(num1, num2);
                break;
            case "multiply":
                printProduct(num1, num2);
                break;
            case "divide":
                printDivision(num1, num2);
                break;
        }
    }

    public static void printSum (int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void printSubtraction (int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }

    public static void printProduct (int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    public static void printDivision (int num1, int num2) {
        int result = num1 / num2;
        System.out.println(result);
    }
}
