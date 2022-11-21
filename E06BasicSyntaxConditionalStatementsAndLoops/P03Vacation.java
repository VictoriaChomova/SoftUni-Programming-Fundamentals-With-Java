package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0;

        if (type.equals("Students")) {
            switch (day) {
                case "Friday":
                    pricePerPerson = 8.45;
                    break;
                case "Saturday":
                    pricePerPerson = 9.80;
                    break;
                case "Sunday":
                    pricePerPerson = 10.46;
                    break;
            }

        } else if (type.equals("Business")) {
            switch (day) {
                case "Friday":
                    pricePerPerson = 10.90;
                    break;
                case "Saturday":
                    pricePerPerson = 15.60;
                    break;
                case "Sunday":
                    pricePerPerson = 16;
                    break;
            }
        } else if (type.equals("Regular")) {
            switch (day) {
                case "Friday":
                    pricePerPerson = 15;
                    break;
                case "Saturday":
                    pricePerPerson = 20;
                    break;
                case "Sunday":
                    pricePerPerson = 22.50;
                    break;
            }
        }
        double totalPrice = group * pricePerPerson;

        if (type.equals("Students") && group >= 30 && group < 100) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (type.equals("Business") && group >= 100) {
            totalPrice = (group - 10) * pricePerPerson;
        } else if (type.equals("Regular") && group >= 10 && group <= 20) {
            totalPrice = totalPrice - 0.05 * totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
