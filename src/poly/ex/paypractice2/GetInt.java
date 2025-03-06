package poly.ex.paypractice2;

import java.util.Scanner;

public class GetInt {
    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("결제 금액을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return amount;
    }
}