package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.userName;

public class Engine {
    public static final int NUMBERS_OF_QUESTIONS = 3;

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
                System.out.println("'" + yesOrNo + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer[i] + "'.");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName);
        System.exit(0);
    }
    private static void checkCorrectWritting(String yesNo){ //нужен только для игры в четность, однако ломает другие игры
        if (!yesNo.equals("no") && !yesNo.equals("yes"))
            System.exit(0);
    }
    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}

