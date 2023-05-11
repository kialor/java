public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500, "Spongebob");

        account1.deposit(100);
        account1.printAccountDetails();

        BankAccount account2 = new BankAccount(5000, "Patrick");
        BankAccount account3 = new BankAccount(300, "Squidward");

        account2.withdrawal(100);
        account3.deposit(100);

        account2.printAccountDetails();
        account3.printAccountDetails();
    }
}
