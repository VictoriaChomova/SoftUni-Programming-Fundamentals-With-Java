package E16Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            if (command.equals("Delete")) {
                int numberToDelete = Integer.parseInt(commandArr[1]);
                for (int i = 0; i <= numbersList.size() - 1; i++) {
                    if (numbersList.get(i) == numberToDelete) {
                        numbersList.remove(i);
                    }
                }
            }
            if (command.equals("Insert")) {
                int numberToInsert = Integer.parseInt(commandArr[1]);
                int indexToInsert = Integer.parseInt(commandArr[2]);
                numbersList.add(indexToInsert, numberToInsert);
            }

            input = scanner.nextLine();
        }

        for (int currentNum : numbersList) {
            System.out.print(currentNum + " ");
        }
    }
}
