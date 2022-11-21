package L11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        String currentElement = "";
        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];

            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }
        System.out.print(String.join(" ", inputArr));
    }
}
