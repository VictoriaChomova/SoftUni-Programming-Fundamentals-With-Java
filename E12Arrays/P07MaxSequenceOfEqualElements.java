package E11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxSequenceCount = 0;
        int currentSeqCount = 1;

        int currentSeqNum = 0;
        int maxSequenceNum = 0;

        for (int i = 1; i < numbersArr.length; i++) {
            if (numbersArr[i] == numbersArr[i-1]){
                currentSeqCount++;
            } else {
                currentSeqCount = 1;
                currentSeqNum = i;
            }

             if (currentSeqCount > maxSequenceCount) {
                 maxSequenceCount = currentSeqCount;
                 maxSequenceNum = currentSeqNum;
             }
        }

        for (int i = maxSequenceNum; i < maxSequenceNum + maxSequenceCount; i++) {
            System.out.print(numbersArr[i] + " ");

        }
    }
}
