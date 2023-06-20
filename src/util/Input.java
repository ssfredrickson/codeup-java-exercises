package util;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static void newScanner() {
        new Scanner(System.in);
    }

    static String getString() {
        String userString = "";
        newScanner();
        System.out.println("Please give me a string:");
        userString = scanner.nextLine();
        System.out.println(userString);
        return userString;
    }

    static boolean yesNo() {
        String userResponse = "";
        newScanner();
        System.out.println("Yes or No?");
        userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("yes") || userResponse.equals("y")) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
