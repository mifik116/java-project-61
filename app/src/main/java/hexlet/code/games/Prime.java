package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getRandomNumber;

public class Prime {
    public static void start() {
        String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[Engine.NUMBERS_OF_QUESTIONS];
        String[] correctAnswer = new String[Engine.NUMBERS_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            int randomNum = getRandomNumber();
            question[i] = String.valueOf(randomNum);
            correctAnswer[i] = isPrime(randomNum) ? "yes" : "no";
        }
        Engine.engineGame(gameQuestion, correctAnswer, question);
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
