package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import static hexlet.code.Engine.getRandomNumber;

public class Progression {
    private static final int arrayLength = 10;
    public static void start(){
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        String[] correctAnswers = new String[Engine.NUMBERS_OF_QUESTIONS];
        String[] question = new String[Engine.NUMBERS_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBERS_OF_QUESTIONS; i++) {
            Random random = new Random();
            int firstNum = getRandomNumber();
            int summand = getRandomNumber();
            String[] arrayNums = NumbsArray(firstNum, summand);
            int randomIndexOfArray = random.nextInt(arrayNums.length);
            String findNum = arrayNums[randomIndexOfArray];
            arrayNums[randomIndexOfArray] = "..";
            question[i] = Arrays.toString(arrayNums);
            correctAnswers[i] = findNum;
        }
        Engine.engineGame(gameQuestion, correctAnswers, question);
    }
    private static String[] NumbsArray(int startArray, int summandArray){
        int[] numbers = new int[Progression.arrayLength];
        numbers[0] = startArray;
        for (int i = 1; i < Progression.arrayLength; i++){
            numbers[i] = numbers[i - 1] + summandArray;
        }
        String[] finalArrayOfNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i ++){
            finalArrayOfNumbers[i] = String.valueOf(numbers[i]);
        }
        return finalArrayOfNumbers;
    }
}
