package poly.ex.paypractice2;

import java.util.Scanner;

public class GetString {
    public static String scanString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("결제 수단을 입력하세요: ");
        String payOption = scanner.nextLine();

        return payOption;
    }
}
