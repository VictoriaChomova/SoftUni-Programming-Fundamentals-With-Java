package L11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int[] numbersArr = new int[values.length];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            numbersArr[i] = Integer.parseInt(values[i]);
        }

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
