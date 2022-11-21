package L14Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputType = scanner.nextLine();

        switch (inputType) {
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
        }
    }

    public static String getMax(String firstInput, String secondInput) {
        if (firstInput.compareTo(secondInput) >= 0) {
            return firstInput;
        } else {
            return secondInput;
        }
    }

    public static char getMax(char firstInput, char secondInput) {
        if (firstInput > secondInput) {
            return firstInput;
        } else {
            return secondInput;
        }
    }

    public static int getMax(int firstInput, int secondInput) {
        if (firstInput > secondInput) {
            return firstInput;
        } else {
            return secondInput;
        }
    }
}
