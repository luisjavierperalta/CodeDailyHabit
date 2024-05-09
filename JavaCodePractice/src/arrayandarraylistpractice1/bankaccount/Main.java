package arrayandarraylistpractice1.bankaccount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    //1 Declaring java's main method
    public static void main(String[] args) {
        //2 Create a List for storing BankAccount objects
        List<BankAccount> accountList = new ArrayList<>();
        //3 Adding 5x different accounts to the List
        accountList.add(new BankAccount("104589", 1000.0, "Henry Glasgow"));
        accountList.add(new BankAccount("546789", 2500.0, "Jane Bartolini"));
        accountList.add(new BankAccount("345098", 1500.0,"Alice Johnson"));
        accountList.add(new BankAccount("798465", 3000.0, "Bob Jefferson"));
        accountList.add(new BankAccount("581321", 1000000.0, "Luis Javier Peralta"));

        //4 Creating the iterator for accountList
        Iterator<BankAccount> iterator = accountList.iterator();

        //5 Using the iterator to access each account obj individually
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            System.out.println("Account Number:" + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance:" + account.getBalance());
            System.out.println(".................................");

            //6 Testing "remove" by remove account with less than 2000.0
            if (account.getBalance() < 2000.0) {
                iterator.remove();
            }

        } //CLOSING WHILE LOOP

        //7 Printing updated List of BankAccount
        System.out.print("Updated List:\n");
        for (BankAccount account : accountList) {
            System.out.println("Account Number:" + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance:" + account.getBalance());
        }


    }
}
