package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.userName;

public class Even {


    public static void start() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int count = 0; count < 3; count++) {
            System.out.println("Question: " + getRandomNumber());
            Scanner yesOrNo = new Scanner(System.in);
            String yesNo = yesOrNo.nextLine();
            if (getRandomNumber() % 2 ==0 && yesNo.equals("yes")) {
                System.out.println("Correct!");
            } else if (getRandomNumber() % 2 !=0 && yesNo.equals("no")) {
                System.out.println("Correct!");
            } else if (getRandomNumber() % 2 == 0 && yesNo.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.exit(0);
            } else if (getRandomNumber() % 2 !=0 && yesNo.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName);
        System.exit(0);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 99) + 1;
    }
}

