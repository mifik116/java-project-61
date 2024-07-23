package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.Scanner;
import static hexlet.code.Cli.greetings;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0":
                System.exit(0);
                break;
            case "1":
                greetings();
                break;
            case "2":
                Even.start();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                GCD.start();
            case "5":
                Progression.start();
            case "6":
                Prime.start();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
