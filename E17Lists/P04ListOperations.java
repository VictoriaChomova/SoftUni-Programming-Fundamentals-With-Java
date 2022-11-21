package E16Lists;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            if (command.equals("Add")) {
                int numberToAdd = Integer.parseInt(commandArr[1]);

                numbersList.add(numberToAdd);

            } else if (command.equals("Insert")) {
                int numberToAdd = Integer.parseInt(commandArr[1]);
                int indexToAdd = Integer.parseInt(commandArr[2]);

                if (indexToAdd > numbersList.size() - 1 || indexToAdd < 0) {
                    System.out.println("Invalid index");
                    input = scanner.nextLine();
                    continue;
                }

                numbersList.add(indexToAdd, numberToAdd);

            } else if (command.equals("Remove")) {
                int indexToRemove = Integer.parseInt(commandArr[1]);

                if (indexToRemove > numbersList.size() - 1 || indexToRemove < 0) {
                    System.out.println("Invalid index");
                    input = scanner.nextLine();
                    continue;
                }

                numbersList.remove(indexToRemove);
            } else if (commandArr[1].equals("left")) {
                int shiftCount = Integer.parseInt(commandArr[2]);

                for (int shift = 1; shift <= shiftCount; shift++) {
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);
                }
            } else if (commandArr[1].equals("right")) {
                int shiftCount = Integer.parseInt(commandArr[2]);

                for (int shift = 1; shift <= shiftCount; shift++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }
            }
            input = scanner.nextLine();
        }
        for (int currentNum : numbersList) {
            System.out.print(currentNum + " ");
        }
    }
}
