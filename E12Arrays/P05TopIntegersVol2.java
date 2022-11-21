package E11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegersVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {

            int currentNum = numbersArr[index];

            boolean isBigger = false;

            if (index == numbersArr.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }

            for (int j = index + 1; j <= numbersArr.length - 1; j++) {

                int currentNum2 = numbersArr[j];
                if (currentNum > currentNum2) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }

            }
            if (isBigger) {
                System.out.print(currentNum + " ");
            }
        }
    }
}

