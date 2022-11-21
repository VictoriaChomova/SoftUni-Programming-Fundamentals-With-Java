package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= orders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double currentPrice = days * capsules * pricePerCapsule;

            totalPrice += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            }
        System.out.printf("Total: $%.2f", totalPrice);
        }
    }
