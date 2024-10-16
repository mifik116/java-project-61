package hexlet.code;

public class Utils {
    static int DEFAULT_NUMBER_RANGE = 10;
    public static int getRandomNumber() {
        return (int) (Math.random() * DEFAULT_NUMBER_RANGE) + 1;
    }
}
