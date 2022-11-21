package L14Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(operations(firstNum, operator, secondNum)));
    }

    public static double operations(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator) {
            case "/":
                result = firstNum / 1.0 / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum + secondNum;
                break;
        }
        return result;
    }
}
