package bank;

public class Account implements SavingAccount{
    private int accountNumber;
    private String owner;
    private int balance;


    public Account(int accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
}
