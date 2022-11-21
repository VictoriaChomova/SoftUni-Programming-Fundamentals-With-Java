package E11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNum1 = numbersArr[i];
            int sum = 0;
            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                int currentNum2 = numbersArr[j];
                sum = currentNum1 + currentNum2;
                if (sum == magicSum) {
                    System.out.println(currentNum1 + " " + currentNum2);
                }

            }

        }
    }
}
