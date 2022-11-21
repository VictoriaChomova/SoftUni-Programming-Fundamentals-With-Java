package E08DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //starting Yield = колко подправки се събират през първия ден.
        //с всеки изминал ден количеството спада с 10/ден.
        //ако количеството за ден спадне под 100 -> напускаме.
        //работниците консумират по 26 подправки за ден и още 26, когато напускат.
        //!! не могат да консумират повече от наличните подправки
        //отпечатваме дните и количеството налични подправки.

        int startYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpices = 0;
        while (startYield >= 100) {
            totalSpices = totalSpices + startYield - 26;
            days++;
            startYield -= 10;
        }
        totalSpices = totalSpices - 26;
        if (totalSpices >= 0) {
            System.out.println(days);
            System.out.println(totalSpices);
        } else {
            System.out.println(days);
            System.out.println("0");
        }
    }
}
