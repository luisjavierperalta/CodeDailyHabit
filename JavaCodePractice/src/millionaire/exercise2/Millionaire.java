package millionaire.exercise2;

/*
A simple Java program using variables that represent:
1 A bank account balance, initial balance
2 Updated bank account balance
3 Print on the console the balance amount on the same line using both print & println statements
 */
public class Millionaire {

    //Declaring main method of the program
    public static void main(String[] args) {

        //Declaring & initializing variable holding the initial bank account balance
        double amountInAccount = 50.22;

        //Re-assign updated value to amountInAccount
        double newAmountInAccount = amountInAccount += 1000000.00;

        newAmountInAccount += 500000.00;

        //Printing total balance amount message to the console
        System.out.print("Total balance in your account to date is $");
        System.out.print(newAmountInAccount);


    }
}
