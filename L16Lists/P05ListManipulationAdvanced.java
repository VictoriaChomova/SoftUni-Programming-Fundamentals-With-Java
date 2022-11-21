package L15Lists;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("Contains")) {
                String [] containsCommand = input.split(" ");
               if (doesContainCertainNumber(numbersList, Integer.parseInt(containsCommand[1]))) {
                   System.out.println("Yes");
               } else {
                   System.out.println("No such number");
               }
            }

            else if (input.equals("Print even")) {
                printEvenNumbersInList(numbersList);
            }

            else if (input.equals("Print odd")) {
                printOddNumbersInList(numbersList);
            }

            else if (input.equals("Get sum")) {
                printSumOfNumbersInList(numbersList);
            }

            else if (input.contains("Filter")){
                String [] filterCommand = input.split(" ");
                String condition = filterCommand[1];
                int number = Integer.parseInt(filterCommand[2]);

                printNumbersThatFulfillCondition(numbersList, condition, number);
            }

                input = scanner.nextLine();
        }
    }

    public static boolean doesContainCertainNumber (List <Integer> numList, int number){
        return numList.contains(number);
    }

    public static void printEvenNumbersInList (List <Integer> numList) {
        String evenNums = "";
        for (int i = 0; i < numList.size() ; i++) {
            if (numList.get(i) % 2 == 0) {
                evenNums += numList.get(i) +  " ";
            }
        }
        System.out.println(evenNums);
    }
    public static void printOddNumbersInList (List <Integer> numList) {
        String oddNums = "";
        for (int i = 0; i < numList.size() ; i++) {
            if (numList.get(i) % 2 != 0) {
                oddNums += numList.get(i) +  " ";
            }
        }
        System.out.println(oddNums);
    }

    public static void printSumOfNumbersInList (List <Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size() ; i++) {
            sum += numList.get(i);
        }
        System.out.println(sum);
    }

    public static void printNumbersThatFulfillCondition (List <Integer> numList, String command, int number) {
        String filteredNumbers = "";

        switch (command) {
            case "<":
                for (int i = 0; i < numList.size() ; i++) {
                    if (numList.get(i) < number) {
                        filteredNumbers += numList.get(i) + " ";
                    }
                } break;
            case ">":
                for (int i = 0; i < numList.size() ; i++) {
                    if (numList.get(i) > number) {
                        filteredNumbers += numList.get(i) + " ";
                    }
                } break;
            case ">=":
                for (int i = 0; i < numList.size() ; i++) {
                    if (numList.get(i) >= number) {
                        filteredNumbers += numList.get(i) + " ";
                    }
                } break;
            case "<=":
                for (int i = 0; i < numList.size() ; i++) {
                    if (numList.get(i) <= number) {
                        filteredNumbers += numList.get(i) + " ";
                    }
                } break;
        }

        System.out.println(filteredNumbers);
    }
}
