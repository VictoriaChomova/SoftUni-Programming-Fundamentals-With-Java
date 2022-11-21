package L14Methods;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensAndOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(productOfEvensAndOdds(number));
    }

    public static int productOfEvensAndOdds(int number) {
        int evenSum = findSumOfEvenNumbers(number);
        int oddSum = findSumOfOddNumbers(number);
        int product = Math.abs(evenSum * oddSum);
        return product;
    }

    public static int findSumOfEvenNumbers(int number) {
        String intToString = Integer.toString(number);
        int[] numbersArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
        }
        return evenSum;
    }

    public static int findSumOfOddNumbers(int number) {
        String intToString = Integer.toString(number);
        int[] numbersArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int oddSum = 0;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 != 0) {
                oddSum += currentNum;
            }
        }
        return oddSum;
    }
}
