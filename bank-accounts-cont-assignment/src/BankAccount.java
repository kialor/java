import java.util.Scanner;
import java.util.ArrayList;
public class BankAccount {
    private double accountBalance;
    private String accountHolder;
    private int accountNumber;

    public BankAccount(double accountBalance, String accountHolder, int accountNumber) {
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(){
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return accountHolder + accountBalance;
    }

    public void deposit(double moneyDeposit){
        accountBalance+=moneyDeposit;
    }

    public void withdrawal(double moneyWithdrawal){
        accountBalance-=moneyWithdrawal;
    }

    public void transfer(ArrayList<BankAccount> bankAccounts, int bankAccountTransfer, double moneyTransfer ){
    BankAccount selectedAccount = null;
    for (BankAccount account : bankAccounts) {
        if(account.getAccountNumber() == bankAccountTransfer){
            selectedAccount=account;
            break;
        }
    }
        this.withdrawal(moneyTransfer);
        selectedAccount.deposit(moneyTransfer);
    }
}

