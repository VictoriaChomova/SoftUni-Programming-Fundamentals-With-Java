package E11Arrays;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChestLoot = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        boolean isEmpty = false;
        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {
                String[] lootCommand = command.split(" ");
                for (int i = 1; i < lootCommand.length; i++) {
                    boolean isFound = false;
                    String foundElement = lootCommand[i];
                    for (int j = 0; j < treasureChestLoot.length; j++) {
                        String currentElementInChest = treasureChestLoot[j];
                        if (foundElement.equals(currentElementInChest)) {
                            isFound = true;
                            j = treasureChestLoot.length - 1;
                        }
                    }
                    if (!isFound) {
                        String[] newTreasureChestLoot = new String[treasureChestLoot.length + 1];
                        newTreasureChestLoot[0] = foundElement;
                        for (int j = 1; j <= newTreasureChestLoot.length - 1; j++) {
                            newTreasureChestLoot[j] = treasureChestLoot[j - 1];
                        }
                        treasureChestLoot = newTreasureChestLoot;
                    }
                }
            }

            if (command.contains("Drop")) {
                String[] dropCommand = command.split(" ");
                int index = Integer.parseInt(dropCommand[1]);

                if (index >= 0 && index <= treasureChestLoot.length - 1) {
                    String droppedElement = treasureChestLoot[index];
                    for (int j = index; j <= treasureChestLoot.length - 1; j++) {
                        if (j == treasureChestLoot.length - 1) {
                            treasureChestLoot[j] = droppedElement;
                        } else {
                            treasureChestLoot[j] = treasureChestLoot[j + 1];
                        }
                    }
                }
            }
            if (command.contains("Steal")) {
                String[] stealCommand = command.split(" ");
                int count = Integer.parseInt(stealCommand[1]);

                if (count >= treasureChestLoot.length) {
                    isEmpty = true;
                    break;
                }
                else if (count < treasureChestLoot.length && count >= 0) {
                    String[] stolenElementsArr = new String[count];
                    String[] elementsLeftArr = new String[treasureChestLoot.length - count];
                    for (int i = 0; i <= treasureChestLoot.length - 1; i++) {
                        if (i < elementsLeftArr.length) {
                            elementsLeftArr[i] = treasureChestLoot[i];
                        } else {
                            stolenElementsArr[i - elementsLeftArr.length] = treasureChestLoot[i];
                        }
                    }
                    for (int i = 0; i <= stolenElementsArr.length - 1; i++) {
                        if (i == stolenElementsArr.length - 1) {
                            System.out.printf("%s%n", stolenElementsArr[i]);
                        } else {
                            System.out.print(stolenElementsArr[i] + ", ");
                        }
                    }
                    treasureChestLoot = elementsLeftArr;
                }
            }
            command = scanner.nextLine();
        }
        if (!isEmpty) {
            int sumLengthElements = 0;
            for (int i = 0; i <= treasureChestLoot.length - 1; i++) {
                String currentElement = treasureChestLoot[i];
                sumLengthElements += currentElement.length();
            }
            double averageTreasureGain = sumLengthElements * 1.0 / treasureChestLoot.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        } else {
            for (int i = 0; i <= treasureChestLoot.length - 1; i++) {
                if (i == treasureChestLoot.length - 1) {
                    System.out.printf("%s%n", treasureChestLoot[i]);
                } else {
                    System.out.print(treasureChestLoot[i] + ", ");
                }
            }
            System.out.println("Failed treasure hunt.");
        }
    }
}
