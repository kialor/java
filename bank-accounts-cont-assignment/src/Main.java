import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        bankAccounts.add(new BankAccount(3400, "Spongebob", 1));
        bankAccounts.add(new BankAccount(2000, "Patrick", 2));
        bankAccounts.add(new BankAccount(4500, "Squidward", 3));

        System.out.println("Hello World! Welcome to the Bank of Kia!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int answer = scanner.nextInt();
        scanner.nextLine();
        String answerString = Integer.toString(answer);

        if (answerString.equals("1")){
            System.out.println("Please enter your account number:");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();

            BankAccount existingAccount = findAccountByNumber(bankAccounts, accountNumber);

            if (existingAccount != null) {
                mainMenu(existingAccount.getAccountHolder(), existingAccount, bankAccounts);
            } else {
                System.out.println("Invalid account number.");
            }
        } else if(answerString.equals("2")){
            System.out.println("Let's make a new account!");
            System.out.println("What is the name for the account?");
            String newName = scanner.nextLine();
            System.out.println("What is the beginning balance for the account?");
            int newBalance = scanner.nextInt();
            scanner.nextLine();

            BankAccount newAccount = new BankAccount();
            newAccount.setAccountHolder(newName);
            newAccount.setAccountBalance(newBalance);

            int newAccountNumber = (int) (Math.random()*10)+3;
            newAccount.setAccountNumber(newAccountNumber);
            bankAccounts.add(newAccount);
            mainMenu(newAccount.getAccountHolder(), newAccount, bankAccounts);
        }
    }


    public static void mainMenu(String accountHolder, BankAccount currentAccount, ArrayList<BankAccount> bankAccounts) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello " + accountHolder);
        System.out.println("Welcome to the main menu, what would you like to do today? Select 1-5.");

        boolean accountExists = true;
        while (accountExists) {
            System.out.println("1. Check account balance");
            System.out.println("2. Make a withdrawal");
            System.out.println("3. Make a deposit");
            System.out.println("4. Make a transfer to an another account");
            System.out.println("5. Exit");

            int selection = scanner.nextInt();
            scanner.nextLine();


            switch (selection) {
                case 1:
                    System.out.println("Account balance: " + currentAccount.getAccountBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw from account:");
                    double withdrawAmount = scanner.nextDouble();
                    currentAccount.withdrawal(withdrawAmount);
                    System.out.println("Balance: $" + currentAccount.getAccountBalance());
                    break;
                case 3:
                    System.out.println("Enter amount to deposit from account:");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    System.out.println("Balance: $" + currentAccount.getAccountBalance());
                    break;
                case 4:
                    System.out.println("Please enter the account number to transfer to: ");
                    int receiveTransfer = scanner.nextInt();
                    scanner.nextLine();

                    BankAccount receivingAccount = findAccountByNumber(bankAccounts, receiveTransfer);

                    if (receivingAccount == null) {
                        System.out.println("Account doesn't exist.");
                        break;
                    }

                    System.out.println("Please enter the amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();

                    currentAccount.transfer(bankAccounts, receiveTransfer, transferAmount);

                    System.out.println("The name on the account is " + currentAccount.getAccountHolder() + " and they have a balance of $" + currentAccount.getAccountBalance());
                    System.out.println("The name on the account is " + receivingAccount.getAccountHolder() + " and they have a balance of $" + receivingAccount.getAccountBalance());
                    accountExists = false;
                    break;
                case 5:
                    System.out.println("Exiting. Have a nice day!");
                    break;
            }

        }
    }
    public static BankAccount findAccountByNumber(ArrayList<BankAccount> bankAccounts, int accountNumber){
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber()== accountNumber){
                return account;
            }
        }
        return null;
    }

}