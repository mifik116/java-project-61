package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + '!');
    }
    public static String getUserName() {
        return userName;
    }
}
