import java.util.Scanner;

public class ATMMachine {
    private BankAccount acc;

    public ATMMachine(BankAccount acc) {
        this.acc = acc;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= acc.getBalance()) {
                acc.setBalance(acc.getBalance() - amount);
                System.out.println("Rs. " + amount + " has been Withdrawn Successfully.");
            } else {
                System.out.println("Insufficient balance or Not Valid Amount.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Rs. " + amount + " has been deposited in your account.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + acc.getBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(100);
        ATMMachine atm = new ATMMachine(acc);

        while (true) {
            System.out.println("Welcome to ABC Bank ATM. Please select an option:");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount for withdrawal: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for choosing ABC Bank ATM. See you again!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}