package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
import static hexlet.code.Cli.greetings;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter." +
                "\n1 - Greet" +
                "\n2 - Even" +
                "\n3- Calc" +
                "\n4 - GCD" +
                "\n5 - Progression" +
                "\n6 - Prime" +
                "\n0 - Exit");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case (0):
                System.exit(0);
                break;
            case (1):
                greetings();
                break;
            case (2):
                Even.start();
                break;
            case (3):
                Calc.start();
                break;
            case (4):
                GCD.start();
            case(5):
                Progression.start();
            case (6):
                Prime.start();
        }
    }
}
