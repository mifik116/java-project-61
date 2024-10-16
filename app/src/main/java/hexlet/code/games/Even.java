package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Even {
    public static final int OPTIONS = 2;
    public static final int RANDOM_NUMBER_RANGE = 10;
    public static void start() {
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAnswers = new String[Engine.NUMBERS_OF_QUESTIONS][OPTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            int randomNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            questionsAnswers[i][0] = String.valueOf(randomNum);
            questionsAnswers[i][1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.engineGame(questionsAnswers, gameQuestion);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
