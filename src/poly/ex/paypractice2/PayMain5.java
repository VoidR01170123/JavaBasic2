package poly.ex.paypractice2;

import java.util.Scanner;

public class PayMain5 {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String payOption = GetString.scanString();

            boolean ExitTF = Exit.paymentExit(payOption);
            if (!ExitTF) {
                break;}

            int amount = GetInt.scanInt();

            payService.processPay(payOption, amount);

        }

    }
}
