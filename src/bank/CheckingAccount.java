package bank;

public class CheckingAccount implements SavingAccount {

    private int accountNumber;
    private String owner;
    private int balance;

    @Override
    public void desposit() {

    }

    @Override
    public void withdraw() {
        if(balance > 0) {
            System.out.println("출금 되었습니다.");
        } else {
            System.out.println("출금할 잔액이 없습니다.");
        }

    }

    @Override
    public void printBalance() {

    }
}
