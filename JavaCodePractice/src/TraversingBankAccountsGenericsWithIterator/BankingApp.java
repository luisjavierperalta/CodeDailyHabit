package TraversingBankAccountsGenericsWithIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankingApp { //1
    //2 Class main method
    public static void main(String[] args) {
        //3 To create & initialize list of @BankAccount objects with Arraylist
        List<BankAccount> accounts = new ArrayList<>();
        //3.1 Adding new @BankAccounts to the Arraylist
        accounts.add(new BankAccount("001", "James Halliday", 750000.0));
        accounts.add(new BankAccount("002", "Alice Monaco", 150000.0));
        accounts.add(new BankAccount("003", "Junior Gentile", 50000.0));

        //4 To create @Iterator object for traversing the ArrayList
        Iterator<BankAccount> iterator = accounts.iterator();

        //4.1 Traversing the list @accounts using @iterator object
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            System.out.println(account);
        }


    }
}
