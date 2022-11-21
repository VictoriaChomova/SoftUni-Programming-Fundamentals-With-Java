package E16Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bombNumberAndPowerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = bombNumberAndPowerList.get(0);
        int power = bombNumberAndPowerList.get(1);

        for (int index = 0; index <= numbersList.size() - 1; index++) {
            int currentNum = numbersList.get(index);
            if (currentNum == bombNumber) {
                for (int i = 1; i <= power; i++) {
                    if (index + 1 < numbersList.size()) {
                        numbersList.remove(index + 1);
                    }
                }
                for (int i = 1; i <= power; i++) {
                    if (index - i >= 0) {
                        numbersList.remove(index - i);
                    }
                }
                numbersList.remove(Integer.valueOf(currentNum));
                index = -1;
            }
        }
        int sum = 0;
        for (int index = 0; index <= numbersList.size() - 1; index++) {
            sum += numbersList.get(index);
        }
        System.out.println(sum);

    }
}
