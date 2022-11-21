package L05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = hours * 60 + minutes + 30;

        int arriveHour = allMinutes / 60;
        int arriveMinutes = allMinutes % 60;

        if (arriveHour > 23) {
            arriveHour = 0;
        }
        System.out.printf("%d:%02d", arriveHour, arriveMinutes);
    }
}
