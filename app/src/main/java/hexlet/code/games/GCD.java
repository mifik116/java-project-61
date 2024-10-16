package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class GCD {
    public static final int OPTIONS = 2;
    public static final int RANDOM_NUMBER_RANGE = 10;
    public static void start() {
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        String[][] questionsAnswers = new String[Engine.NUMBERS_OF_QUESTIONS][OPTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            int firstNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            int secondNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            int correctAnswer = getGCD(firstNum, secondNum);
            questionsAnswers[i][0] = firstNum + " " + secondNum;
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }
        Engine.engineGame(questionsAnswers, gameQuestion);
    }

    private static int getGCD(int firstNumber, int secondNumber) {
        while ((firstNumber != 0) && (secondNumber != 0)) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return firstNumber + secondNumber;
    }
}
