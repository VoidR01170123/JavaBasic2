public class gittest {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        System.out.println(sum + "테스트용");
    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
