package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Calc {
    public static final int OPTIONS = 2;
    public static final int RANDOM_NUMBER_RANGE = 10;

    public static void start() {
        String gameQuestion = "What is the result of the expression?";
        String[] typoOfExpression = {" * ", " + ", " - "};
        String[][] questionsAnswers = new String[Engine.NUMBERS_OF_QUESTIONS][OPTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            String expression = typoOfExpression[getRandomNumber((typoOfExpression.length))];
            int firstNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            int secondNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            int correctAnswer = resultOfExpression(firstNum, secondNum, expression);
            String question = firstNum + expression + secondNum;
            questionsAnswers[i][0] = question;
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }
        Engine.engineGame(questionsAnswers, gameQuestion);
    }

    private static int resultOfExpression(int firstNumber, int secondNumber, String expression) {
        return switch (expression) {
            case "*" -> firstNumber * secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "+" -> firstNumber + secondNumber;
            default -> throw new Error("Wrong typr of expression");
        };
    }
}