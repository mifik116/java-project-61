package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Prime {
    public static final int OPTIONS = 2;
    public static final int RANDOM_NUMBER_RANGE = 10;
    public static void start() {
        String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAnswers = new String[Engine.NUMBERS_OF_QUESTIONS][OPTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            int randomNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            questionsAnswers[i][0] = String.valueOf(randomNum);
            questionsAnswers[i][1] = isPrime(randomNum) ? "yes" : "no";
        }
        Engine.engineGame(questionsAnswers, gameQuestion);
    }
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }
}
