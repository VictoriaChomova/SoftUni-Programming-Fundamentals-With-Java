package E05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String passwordInput = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        int inputCount = 0;

        for (int i = username.length(); i > 0; i--) {
            char currentLetter = username.charAt(i - 1);

            password.append(currentLetter);
        }
        while (!passwordInput.equals(password.toString())) {
            inputCount += 1;
            if (inputCount == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            passwordInput = scanner.nextLine();

        }
        if (inputCount < 4) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
