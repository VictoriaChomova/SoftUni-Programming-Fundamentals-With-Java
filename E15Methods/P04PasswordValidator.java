package E15Methods;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (isPaswordValid(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isPaswordValid(String password) {
        boolean isPasswordValid = false;
        boolean isRule1Valid = calculateNumberOfCharacters(password);
        boolean isRule2Valid = isComposedOfLettersAndDigits(password);
        boolean isRule3Valid = isComposedOfAtLeastTwoDigits(password);
        if (isRule1Valid && isRule2Valid && isRule3Valid) {
            isPasswordValid = true;
        }
        return isPasswordValid;
    }

    public static boolean calculateNumberOfCharacters(String password) {
        boolean isValid = true;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        return isValid;
    }

    public static boolean isComposedOfLettersAndDigits(String password) {
        boolean isValid = true;
        char[] passwordArr = password.toCharArray();
        for (char i : passwordArr) {
            if (!Character.isLetterOrDigit(i)) {
                isValid = false;
            }
        }

        if (!isValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        return isValid;
    }

    public static boolean isComposedOfAtLeastTwoDigits(String password) {
        int digitsCount = 0;
        boolean isValid = false;
        char[] passwordArr = password.toCharArray();
        for (char i : passwordArr) {
            if (Character.isDigit(i)) {
                digitsCount++;
            }
            if (digitsCount == 2) {
                isValid = true;
                return isValid;
            }
        }
        if (!isValid) {
            System.out.println("Password must have at least 2 digits");
        }
        return isValid;
    }

}



