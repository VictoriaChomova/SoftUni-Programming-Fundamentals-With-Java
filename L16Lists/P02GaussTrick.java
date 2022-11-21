package L15Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int listSize = numbersList.size();
        for (int i = 0; i < listSize / 2; i++) {
            int firstElement = numbersList.get(i);
            int secondElement = numbersList.get(listSize - 1 - i);
            int sumElements = firstElement + secondElement;
            numbersList.set(i, sumElements);
            numbersList.remove(numbersList.size() - 1);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));

    }
}
