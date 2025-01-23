package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 생성자를 만들어 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double)sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minimum1 = values[0];
        for (int value : values) {
            if (value < minimum1) {
                minimum1 = value;
            }
        }
        return minimum1;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
