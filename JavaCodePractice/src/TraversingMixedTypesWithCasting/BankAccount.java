package TraversingMixedTypesWithCasting;

/*
Java's exercise for practice @Traversing ArrayList of @BankAccount obj <Generics> using the @Iterator Interface

 */
public class BankAccount { //1
    //2 private field of class (instance variables)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    //3 Defining @BankAccount class constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;


    }

    //4 Declaring public getters methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    //5 @Override toString method
    public String toString() {
        return ("BankAccount:" + "AccountNumber :" + accountNumber + "AccountHolder:" + accountHolder + "Balance:" + balance);


    }


}
