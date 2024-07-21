package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getRandomNumber;

public class GCD {
    public static void start() {
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        String[] correctAnswers = new String[Engine.NUMBERS_OF_QUESTIONS];
        String[] question = new String[Engine.NUMBERS_OF_QUESTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            int firstNum = getRandomNumber();
            int secondNum = getRandomNumber();
            int correctAnswer = getGCD(firstNum, secondNum);
            question[i] = firstNum + " " + secondNum;
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        Engine.engineGame(gameQuestion, correctAnswers, question);
    }

    private static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return firstNumber + secondNumber;
    }
}

