package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter." +
                "\n1 - Greet" +
                "\n2 - Even" +
                "\n0 - Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Cli.greetings();
        }
        if (choice == 2){
            Even.start();
        }
    }
}
