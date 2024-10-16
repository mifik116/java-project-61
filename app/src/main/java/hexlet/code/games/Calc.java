package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Utils.getRandomNumber;

public class Calc {

    public static void start() {
        String gameQuestion = "What is the result of the expression?";
        String[] typoOfExpression = {" * ", " + ", " - "};
        String[] correctAnswers = new String[Engine.NUMBERS_OF_QUESTIONS];
        String[] question = new String[Engine.NUMBERS_OF_QUESTIONS];
        Random randomExpression = new Random();
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            String expression = typoOfExpression[randomExpression.nextInt(typoOfExpression.length)];
            int firstNum = getRandomNumber();
            int secondNum = getRandomNumber();
            int correctAnswer = resultOfExpression(firstNum, secondNum, expression);
            question[i] = firstNum + expression + secondNum;
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        Engine.engineGame(gameQuestion, correctAnswers, question);
    }
    private static int resultOfExpression(int firstNumber, int secondNumber, String expression) {
        if (expression.equals(" * ")) {
            return firstNumber * secondNumber;
        } else if (expression.equals(" + ")) {
            return firstNumber + secondNumber;
        } else {
            return firstNumber - secondNumber;
        }
    }
}
