package E16Lists;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                String [] addCommandArr = command.split("\\s+");
                int passengersToAdd = Integer.parseInt(addCommandArr[1]);
                train.add(passengersToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(command);

                for (int i = 0; i <= train.size() - 1 ; i++) {
                    int currentWagon = train.get(i);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        train.set(i, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
                command = scanner.nextLine();
        }
        for (int currentNum : train) {
            System.out.print(currentNum + " ");
        }
    }
}
