package E16Lists;

import java.lang.management.MemoryType;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        //докато един от играчите не остане без карти:
        while (firstHand.size() != 0 && secondHand.size() != 0) {

            int minHandSize = Math.min(firstHand.size(), secondHand.size());
            // -сравняваме по индекс картите;
            for (int i = 0; i <= minHandSize - 1; i++) {
                int firstHandCard = firstHand.get((0));
                int secondHandCard = secondHand.get(0);

                // -играчът с по-голяма карта получава двете карти -> добавяме накрая първо неговата карта,
                //      след това картата на другия играч
                // -изтриваме съответната карта от тестето на другия играч

                if (firstHandCard > secondHandCard) {
                    modifyHands(firstHand, secondHand, firstHandCard, secondHandCard);

                } else if (secondHandCard > firstHandCard) {
                   modifyHands(secondHand, firstHand, secondHandCard, firstHandCard);

                    // АКО КАРТИТЕ СА ЕДНАКВИ -> изтриваме и двете карти от тестетата на играчите.
                } else if (firstHandCard == secondHandCard) {
                    firstHand.remove(0);
                    secondHand.remove(0);
                }
            }
        }

        //Когато един от играчите остане без карти -> намираме кой е победителят и сумираме картите от тестето му.
        int sum = 0;
        String winner = "";
        if (firstHand.size() == 0) {
            winner = "Second player";
            for (int i = 0; i <= secondHand.size() - 1; i++) {
                sum += secondHand.get(i);
            }
        } else {
            winner = "First player";
            for (int i = 0; i <= firstHand.size() - 1; i++) {
                sum += firstHand.get(i);
            }
        }

        System.out.printf("%s wins! Sum: %d", winner, sum);
    }

    private static void modifyHands(List<Integer> winningHand, List<Integer> losingHand, int winningCard, int losingCard) {
        winningHand.remove(0);
        winningHand.add(winningCard);
        winningHand.add(losingCard);
        losingHand.remove(0);
    }
}
