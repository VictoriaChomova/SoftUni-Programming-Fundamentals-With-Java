package E15Methods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractNumbers(calculateSumOfNums(firstNum, secondNum), thirdNum));
    }

    public static int calculateSumOfNums (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int subtractNumbers (int sum, int thirdNum) {
        return sum - thirdNum;
    }
}
