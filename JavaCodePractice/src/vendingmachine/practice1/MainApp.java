package vendingmachine.practice1;

import static vendingmachine.practice1.VendingMachine.canAffordDrink;


public class MainApp {

    public static void main(String[] args) {
        boolean isCold = true;
        int moneyInCents = 300;

        if (canAffordDrink(isCold, moneyInCents)) {
            System.out.println("Congratulations! You can buy a Drink");

        }
    }
}
