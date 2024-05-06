package vendingmachine.practice1;

/*
Java program to practice mixed use of compound & logical operators
by creating a VendingMachine program with Drinks priced differently
and a fixed amount of Cash for test affordability.
 */
public class VendingMachine {

    //Let's define drinks
    static final int WATER_PRICE = 100; //cents
    static final int SODA_PRICE = 150;
    static final int JUICE_PRICE = 200;

    //Let's define functionality logic
    public static boolean canAffordDrink(boolean isCold, int moneyInCents) {
        if (isCold) {
            if (moneyInCents < SODA_PRICE) {
                System.out.println("Money not enough for Soda");
                return false;
            } else {
                if (moneyInCents >= JUICE_PRICE) {
                    moneyInCents -= JUICE_PRICE;
                    System.out.println("You can buy Juice");
                    return true;
                } else {
                    moneyInCents -= WATER_PRICE;
                    System.out.println("You can buy Water");
                    return true;

                }
            }
        }
    return true;
    }

}
