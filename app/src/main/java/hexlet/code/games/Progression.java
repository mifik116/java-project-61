package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Utils.getRandomNumber;

public class Progression {
    public static final int OPTIONS = 2;
    private static final int DEFAULT_ARRAY_LENGTH = 10;
    public static final int RANDOM_NUMBER_RANGE = 10;
    public static void start() {
        String gameQuestion = "What number is missing in the progression?";
        String[][] questionsAnswers = new String[Engine.NUMBERS_OF_QUESTIONS][OPTIONS];
        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            Random random = new Random();
            int firstNum = getRandomNumber(RANDOM_NUMBER_RANGE);
            int summand = getRandomNumber(RANDOM_NUMBER_RANGE);
            String[] arrayNums = numbsArray(firstNum, summand);
            int randomIndexOfArray = random.nextInt(arrayNums.length);
            String findNum = arrayNums[randomIndexOfArray];
            arrayNums[randomIndexOfArray] = "..";
            questionsAnswers[i][0] = String.join(" ", arrayNums);
            questionsAnswers[i][1] = findNum;
        }
        Engine.engineGame(questionsAnswers, gameQuestion);
    }
    private static String[] numbsArray(int startArray, int summandArray) {
        String[] numbers = new String[Progression.DEFAULT_ARRAY_LENGTH];
        numbers[0] = String.valueOf(startArray);
        for (int i = 0; i < Progression.DEFAULT_ARRAY_LENGTH; i++) {
            numbers[i] = String.valueOf(startArray + summandArray * i);
        }
        return numbers;
    }
}
