package bank;

public class SavingAccount implements AccountInterface {

    private int accountNumber; // 계좌 번호
    private String owner; // 사용자
    private int balance; // 계좌 잔액

    public SavingAccount(int accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public int deposit(int amount) {
        if (balance <= amount) {
            throw new IllegalArgumentException("[예외] 입금 실패 → 유효하지 않은 금액");
        }
        balance += amount;
        System.out.println("[입금] " + owner + " 적금 계좌 " + amount + "원 입금 → 잔액: " + balance + "원");
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        throw new RuntimeException("[예외] 출금 실패 → 적금 계좌는 출금할 수 없습니다.");
    }

    @Override
    public void showBalance() {
        System.out.println("[조회] " + owner + " 적금 계좌 현재 잔액: " + balance + "원");
    }

}
