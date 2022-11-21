package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double moneySum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                moneySum += coins;
            } else {
                System.out.printf("Cannot accept %.2f", coins);
                System.out.println();
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double change = moneySum;

        while (!product.equals("End")) {
            double productPrice = 0;

            switch (product) {
                case "Nuts":
                    productPrice = 2;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    continue;
            }
            if (change >= productPrice) {
                change -= productPrice;
                System.out.println("Purchased " + product);
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", change);
    }
}
