package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.userName;

public class Even {

    private static final int numsQuestions = 3;
    public static void start() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int count = 0; count < numsQuestions; count++) {
            System.out.println("Question: " + getRandomNumber());
            Scanner yesOrNo = new Scanner(System.in);
            String yesNo = yesOrNo.nextLine();
            if (!yesNo.equals("no") && !yesNo.equals("yes")){
                System.exit(0);
            }
            if (isEven(getRandomNumber()) && yesNo.equals("yes")) {
                System.out.println("Correct!");
            } else if (!isEven(getRandomNumber()) && yesNo.equals("no")) {
                System.out.println("Correct!");
            } else if (isEven(getRandomNumber()) && yesNo.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.exit(0);
            } else if (!isEven(getRandomNumber()) && yesNo.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName);
        System.exit(0);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 11);
    }
}

