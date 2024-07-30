package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.getUserName;

public class Engine {
    public static final int NUMBERS_OF_QUESTIONS = 3;
    static final int DEFAULT_NUMBER_RANGE = 10;
    public static void engineGame(String gameQuestion, String[] correctAnswer, String[] question) {
        Scanner scanner = new Scanner(System.in);
        Cli.greetings();
        System.out.println(gameQuestion);
        for (int i = 0; i < NUMBERS_OF_QUESTIONS; i++) {
            System.out.println("Question: " + question[i]);
            System.out.println("Your answer: ");
            String yesOrNo = scanner.nextLine();
            if (correctAnswer[i].equals(yesOrNo)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", yesOrNo, correctAnswer[i]);
                System.out.println("Let's try again, " + getUserName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + getUserName() + "!");
        System.exit(0);
    }
    /* public static void checkCorrectWritting(String yesNo){ //нужен только для игры в четность и простое число,
        if (!yesNo.equals("no") && !yesNo.equals("yes"))       //однако ломает другие игры
            System.exit(0);
    } */
    public static int getRandomNumber() {
        return (int) (Math.random() * DEFAULT_NUMBER_RANGE) + 1;
    }
}
