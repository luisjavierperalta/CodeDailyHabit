package bankingapp;

public class BankAccount {

    //Let's define Instance Fields
    private final String accountNumber;
    private String ownerName;
    private double balance;

    //OK cool, now let's define Java Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;

    }

    //Let's define deposit function (method)
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Deposited. New available balance: " + balance);
    }

    //Cool let's now define withdrawal function
    public void withdraw(double amount) {
        //Let's define decision statament
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "Withdrawn.New available balance is :");

        }
        else {
            System.out.println("Insufficient funds. Withdrawal not processed");
        }
    }

    //OK cool let's define now a function to display balance
    public void displayBalance() {
        System.out.println("Account balance for" + ownerName + "is" + balance);
    }

    //OK COOL FOR NOW
}
