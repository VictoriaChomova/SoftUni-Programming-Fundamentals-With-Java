package E16Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();
        for (int i = 1; i <= numberOfInputs; i++) {

            String command = scanner.nextLine();
            String[] commandArr = command.split("\\s+");
            String name = commandArr[0];
            boolean nameFound = false;

            if (command.contains("not")) {
                nameFound = isNameFound(namesList, name);

                if (!nameFound) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    namesList.remove(name);
                }
            }

            else {
                nameFound = isNameFound(namesList, name);

                if (nameFound) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesList.add(name);
                }
            }
        }

        for (String name:namesList) {
            System.out.println(name);
        }
    }

    private static boolean isNameFound(List<String> namesList, String name) {
        boolean nameFound = false;
        for (int j = 0; j <= namesList.size() - 1; j++) {
            if (name.equals(namesList.get(j))) {
                nameFound = true;
                break;
            }
        }
        return nameFound;
    }
}

