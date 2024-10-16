package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBERS_OF_QUESTIONS = 3;

    public static void engineGame(String[][] questionsAnswers, String gameQuestion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + '!');
        System.out.println(gameQuestion);
        for (int i = 0; i < NUMBERS_OF_QUESTIONS; i++) {
            String question = questionsAnswers[i][0];
            String correctAnswer = questionsAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String yesOrNo = scanner.nextLine();
            if (correctAnswer.equals(yesOrNo)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", yesOrNo, correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
