package L14Methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatText(text, count));
    }

    public static StringBuilder repeatText(String text, int count) {
        StringBuilder fullText = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            fullText.append(text);
        }
        return fullText;
    }
}
