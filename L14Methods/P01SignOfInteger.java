package L14Methods;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());
        printSign(numInput);
    }


    public static void printSign(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
