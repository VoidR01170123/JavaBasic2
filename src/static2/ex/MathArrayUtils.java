package static2.ex;

public class MathArrayUtils {

    private static int sum;
    private static int count;

    public static int sum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        return sum;
    }

    public static int average(int[] array) {
        int average = 0;
        average = sum / count;

        return average;
    }

}
