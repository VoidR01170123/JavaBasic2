package access.selfpractice;

public class MaxCounter {
    private int count = 0;
    int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값 넘을 수 없음");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

}
