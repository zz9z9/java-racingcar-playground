package racing.util;

public class NumberGenerator {
    public static int getRandomNum() {
        int MAX = 9;
        int MIN = 0;

        return (int) (Math.random()*(MAX-MIN+1)) + MIN;
    }
}
