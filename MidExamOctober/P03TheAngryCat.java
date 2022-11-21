package MidExamOctober;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //на първия ред получаваме рейтинг на вещите -> лист от цели числа, разделени с ", ";
        List<Integer> ratingList = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //на втори ред получаваме стартова точка -> цяло число, между втория и предпоследния индекс на листа;
        int entryPoint = Integer.parseInt(scanner.nextLine());
        //на трети ред получаваме тип елементи, които Джон иска да унищожи:
        //  - "cheap"; --> предмети, които имат по-нисък рейтинг от стартовата точка;
        //  - "expensive"; --> предмети, които имат равен или по-висок рейтинг;
        String elementsType = scanner.nextLine();
        int leftSum = 0;
        int rightSum = 0;

        for (int leftIndex = 0; leftIndex < entryPoint; leftIndex++) {
            int currentElement = ratingList.get(leftIndex);
            if (elementsType.equals("cheap")) {
                if (currentElement < ratingList.get(entryPoint)) {
                    leftSum += currentElement;
                }
            } else if (elementsType.equals("expensive")) {
                if (currentElement >= ratingList.get(entryPoint)) {
                    leftSum += currentElement;
                }

            }
        }
        // Джон унищожава предмети от стартовата точка наляво и от стартовата точка надясно, но без стартовата точка.
        // Сумираме щетите от ляво и от дясно поотделно.
        for (int rightIndex = entryPoint + 1; rightIndex <= ratingList.size() - 1; rightIndex++) {
            int currentElement = ratingList.get(rightIndex);
            if (elementsType.equals("cheap")) {
                if (currentElement < ratingList.get(entryPoint)) {
                    rightSum += currentElement;
                }
            } else if (elementsType.equals("expensive")) {
                if (currentElement >= ratingList.get(entryPoint)) {
                    rightSum += currentElement;
                }
            }
        }


        // Принтираме по-високата сума, а ако са равни -> лявата сума.
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }





    }
}
