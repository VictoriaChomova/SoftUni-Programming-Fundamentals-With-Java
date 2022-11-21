package E11Arrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String [] firstArr = new String[rows];
        String [] secondArr = new String[rows];

        for (int i = 1; i <= rows; i++) {
            String [] nums = scanner.nextLine().split(" ");
            String firstNum = nums[0];
            String secondNum = nums[1];

            if (i % 2 ==0) {
                firstArr [i-1] = secondNum;
                secondArr [i-1] = firstNum;
            } else {
                firstArr [i-1] = firstNum;
                secondArr [i-1] = secondNum;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
