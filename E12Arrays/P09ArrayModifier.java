package E11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                String[] swap = command.split(" ");

                int firstIndex = Integer.parseInt(swap[1]);
                int secondIndex = Integer.parseInt(swap[2]);
                int firstNumber = numbersArr[firstIndex];
                numbersArr[firstIndex] = numbersArr[secondIndex];
                numbersArr[secondIndex] = firstNumber;

            } else if (command.contains("multiply")) {
                String[] multiply = command.split(" ");
                int firstIndex = Integer.parseInt(multiply[1]);
                int secondIndex = Integer.parseInt(multiply[2]);
                int product = numbersArr[firstIndex] * numbersArr[secondIndex];
                numbersArr[firstIndex] = product;

            } else if (command.equals("decrease")) {
                for (int i = 0; i <= numbersArr.length - 1; i++) {
                    numbersArr[i]--;
                }

            }

            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            if (i != numbersArr.length - 1) {
                System.out.print(numbersArr[i] + ", ");
            } else {
                System.out.print(numbersArr[i]);
            }
        }
    }
}
