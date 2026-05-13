package bank;

public interface AccountInterface {
    int deposit(int amount);   // 입금
    int withdraw(int amount);  // 출금
    void showBalance();       // 잔액 조회
}
