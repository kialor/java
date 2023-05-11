public class BankAccount {
    public double accountBalance;
    public String accountHolder;

    public BankAccount(double accountBalance, String accountHolder) {
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double moneyDeposit){
        accountBalance+=moneyDeposit;
    }

    public void withdrawal(double moneyWithdrawal){
        accountBalance-=moneyWithdrawal;
    }

    public void printAccountDetails(){
        System.out.println(this.accountHolder+ "'s account balance: " +this.accountBalance);

    }
}

