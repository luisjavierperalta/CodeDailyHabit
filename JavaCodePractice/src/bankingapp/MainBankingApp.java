package bankingapp;

import java.util.Scanner;

public class MainBankingApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("0012358", "Luis Javier Peralta", 1000000.0);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to MyBank app");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            //Let's define a switch
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thanks for using MyBank app!");
                    break;
                default:
                    System.out.println("Invalid choice. re-try again");

            }
        } while (choice != 4);

        scanner.close();
    }
}
//COOL Let's run this
