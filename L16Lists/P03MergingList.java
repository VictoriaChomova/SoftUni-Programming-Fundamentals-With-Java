package L15Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            int firstNum = firstList.get(i);
            int secondNum = secondList.get(i);

            newList.add(firstNum);
            newList.add(secondNum);
        }

        if (firstList.size() > secondList.size()) {
            newList.addAll(getRemainingElements(firstList, secondList));
        } else {
            newList.addAll(getRemainingElements(secondList, firstList));
        }

        System.out.println(joinElementsByDelimiter(newList, " "));

    }

    public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {

        List<Integer> remainingElementsList = new ArrayList<>();

        for (int i = shorterList.size(); i < longerList.size(); i++) {
            remainingElementsList.add(longerList.get(i));
        }

        return remainingElementsList;
    }

    public static String joinElementsByDelimiter (List <Integer> elements, String delimiter) {
        String output = "";

        for (Integer element : elements) {
            output += element + delimiter;

        }
        return output;
    }
}
