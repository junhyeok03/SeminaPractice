package bank;

public class DepositAccount implements AccountInterface {
    private int accountNumber; // 계좌 번호
    private String owner; // 사용자
    private int balance; // 계좌 잔액

    public DepositAccount(int accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    @Override
    public int deposit(int amount) {
        if (balance <= amount || 0 >= amount) {
            throw new IllegalArgumentException("[예외] 입금 실패 → 유효하지 않은 금액");
        }
        balance += amount;
        System.out.println("[입금] " + owner + " 계좌 " + amount + "원 입금 → 잔액: " + balance + "원");
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("[예외] 출금 실패 → 유효하지 않은 금액");
        }
        if (amount > balance) {
            throw new RuntimeException("[예외] 출금 실패 → 잔액 부족");
        }
        balance -= amount;
        System.out.println("[출금] " + owner + " 계좌 " + amount + "원 출금 → 잔액: " + balance + "원");
        return balance;
    }

    public void transfer(DepositAccount target, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("[예외] 이체 실패 → 유효하지 않은 금액");
        }
        if (amount > balance) {
            throw new RuntimeException("[예외] 이체 실패 → 잔액 부족");
        }
        balance -= amount;
        target.balance += amount;
        System.out.println("[이체] " + owner + " → " + target.owner + " " + amount + "원 이체 → " + owner + " 잔액: " + balance + "원");
    }

    public void showBalance() {
        System.out.println("[조회] " + owner + " 계좌 현재 잔액: " + balance + "원");
    }
}
