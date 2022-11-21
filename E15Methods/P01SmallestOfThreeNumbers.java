package E15Methods;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        int smallestNum = thirdNum;
        if (firstNum < secondNum) {
            if (firstNum < thirdNum) {
                smallestNum = firstNum;
            }
        } else if (secondNum < firstNum) {
            if (secondNum < thirdNum) {
                smallestNum = secondNum;
            }
        }

        System.out.println(smallestNum);
    }
}
