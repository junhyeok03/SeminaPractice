package bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        DepositAccount hong = new DepositAccount(1001, "홍길동", 100000);
        DepositAccount kim = new DepositAccount(1002, "김철수", 50000);

        try { hong.deposit(50000); } catch (RuntimeException e) { System.out.println(e.getMessage()); }
        try { hong.withdraw(30000); } catch (RuntimeException e) { System.out.println(e.getMessage()); }
        try { hong.transfer(kim, 50000); } catch (RuntimeException e) { System.out.println(e.getMessage()); }
        hong.showBalance();
        try { hong.withdraw(200000); } catch (RuntimeException e) { System.out.println(e.getMessage()); }
        try { hong.deposit(-1000); } catch (RuntimeException e) { System.out.println(e.getMessage()); }
    }
}
