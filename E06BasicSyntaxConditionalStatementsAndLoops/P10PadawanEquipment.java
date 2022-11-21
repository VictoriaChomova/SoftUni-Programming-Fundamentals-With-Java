package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());


        double lightsabersCount = students + Math.ceil(0.1 * students);
        int beltsCount = students - students / 6;

        double totalExpenses = lightsabersCount * lightsaberPrice + beltsCount * beltPrice + robePrice * students;
        if (money >= totalExpenses) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalExpenses);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalExpenses - money);
        }
    }
}


