package arrayandarraylistpractice1.bankaccount;

/*
BANK ACCOUNT PROGRAM
Java program that creates a list of "BankAccount" objects & iterate using an Iterator (Enhanced for loop) to
access each account object individually
 */
public class BankAccount {
    //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS
    //1 Declare 3x private instance variables to represent BankAccount's Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    //2 Defining Class's Constructor with 3x parameters (init class objs state)
    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;

    }

    //3 Declaring set methods for access "private attributes" from external classes
    public String getAccountNumber() {
        return accountNumber;
    }
    //3.1
    public double getBalance() {
        return balance;
    }
    //3.2
    public String getAccountHolderName() {
        return accountHolderName;
    }

    //4 Declaring set method for updating "private attributes" from external classes
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    //4.1
    public void setBalance (double balance) {
        this.balance = balance;
    }
    //4.2
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

}
