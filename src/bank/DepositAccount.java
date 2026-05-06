package bank;

public class DepositAccount implements SavingAccount {
    private int accountNumber;
    private String owner;
    private int balance;
    private int despositPrice;

    public DepositAccount(int accountNumber, String owner, int despositPrice){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance;
    }

    @Override
    public void desposit() {
        System.out.println(despositPrice+ "원이 입금 되었습니다.");
    }

    @Override
    public void printBalance() {
        System.out.println("계좌 잔고 :" + balance);
    }
}
