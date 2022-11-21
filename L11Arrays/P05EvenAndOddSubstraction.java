package L11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int num : numbersArr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.printf("%d", evenSum - oddSum);
    }
}
