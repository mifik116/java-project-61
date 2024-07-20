package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumber;

public class Even {

    public static void start() {
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] correctAnswer = new String[Engine.NUMBERS_OF_QUESTIONS];
        String[] question = new String[Engine.NUMBERS_OF_QUESTIONS];
        for (int i =0; i<Engine.NUMBERS_OF_QUESTIONS;i++) {
            int randomNum = getRandomNumber();
            question[i] = String.valueOf(randomNum);
            correctAnswer[i] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.engineGame(gameQuestion, correctAnswer, question);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


