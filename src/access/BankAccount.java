package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }


    //public method : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야한다
        return amount > 0;
    }
}
