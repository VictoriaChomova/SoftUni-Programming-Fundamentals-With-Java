package E16Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> numbersList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(numbersList);

        System.out.println(numbersList.toString()
                .replace("[", "").replace("]", "")
                .trim().replaceAll(",", "").replaceAll("\\s+", " "));


//        //1 2 3 |4 5 6 |  7  8
//        String[] inputArr = scanner.nextLine().split("\\|"); //["1 2 3", "4 5 6", " 7  8"]
//
//        List<String> sortedNumbersList = new ArrayList<>();
//
//        for (int i = inputArr.length - 1; i >= 0; i--) {
//           String[] currentCollectionArr = inputArr[i].trim().split("\\s+");
//            for (int j = 0; j <= currentCollectionArr.length - 1; j++) {
//                String currentNumber = currentCollectionArr[j];
//                    sortedNumbersList.add(currentNumber);
//            }
//        }
//
//        System.out.println(String.join(" ", sortedNumbersList));
    }
}
