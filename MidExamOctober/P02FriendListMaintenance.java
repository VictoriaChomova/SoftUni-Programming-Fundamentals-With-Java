package MidExamOctober;

import java.util.Scanner;

public class P02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //на първи ред получаваме списък с приятели, раделени със ", "
        String[] friendsListArr = scanner.nextLine().split(", ");


        //на следващите редове до получаване на команда "Report", получаваме следните команди:
        String input = scanner.nextLine();
        int blacklistedCount = 0;
        int lostNamesCount = 0;

        while (!input.equals("Report")) {
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            // -    "Blacklist {name}"    -> проверяваме дали това име го има в списъка. Ако го няма -> "{name} was not found."
            //                          -> променяме името на Blacklisted и принтираме "{name} was blacklisted."
            if (command.equals("Blacklist")) {
                boolean isFound = false;
                for (int i = 0; i <= friendsListArr.length - 1; i++) {
                    String currentName = friendsListArr[i];
                    if (currentName.equals(commandArr[1])) {
                        isFound = true;
                        friendsListArr[i] = "Blacklisted";
                        blacklistedCount++;
                        System.out.printf("%s was blacklisted.%n", currentName);
                        break;
                    }
                }
                if (!isFound) {
                    System.out.printf("%s was not found.%n", commandArr[1]);
                }
            }

            // -   "Error {index}"      -> ако индексът е валиден и името не е Blacklisted -> променяме го на Lost и принтираме "{name} was lost due to an error."
            //                          -> в противен случай - игнорираме командата;
            if (command.equals("Error")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index >= 0 && index <= friendsListArr.length - 1) {
                    String currentName = friendsListArr[index];
                    if (!currentName.equals("Blacklisted") && !currentName.equals("Lost")){
                        friendsListArr[index] = "Lost";
                        lostNamesCount++;
                        System.out.printf("%s was lost due to an error.%n", currentName);
                    }
                }
            }
            // -	"Change {index} {new name}"  -> ако индексът е валиден - сменяме името с новото и принтираме o	"{current name} changed his username to {new name}."
            //                                   -> преди това запазваме променлива със старото име.
            //                                   -> в противен случай игнорираме командата.
            if (command.equals("Change")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index >= 0 && index <= friendsListArr.length - 1) {
                    String currentName = friendsListArr[index];
                    if (!currentName.equals("Blacklisted")){
                        friendsListArr[index] = commandArr[2];
                        System.out.printf("%s changed his username to %s.%n", currentName, commandArr[2]);
                    }
                }
            }
            input = scanner.nextLine();

        }

        // След получаване на команда "Report" принтираме:
        //  -	"Blacklisted names: {number of blacklisted names}"
        //  -	"Lost names: {number of lost names}"
        //  - списъкът с приятели.
        System.out.printf("Blacklisted names: %d%n", blacklistedCount);
        System.out.printf("Lost names: %d%n", lostNamesCount);
        System.out.println(String.join(" ", friendsListArr));
    }
}
