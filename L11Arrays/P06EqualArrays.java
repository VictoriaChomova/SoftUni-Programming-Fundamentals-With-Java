package L11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean ifIdentical = true;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
            } else {
                ifIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (ifIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
