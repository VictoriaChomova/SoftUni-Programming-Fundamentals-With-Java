package E11Arrays;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String firstElement = numbersArr[0];
            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j + 1];
            }
            numbersArr[numbersArr.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", numbersArr));
    }
}
