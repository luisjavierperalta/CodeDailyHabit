package programmingoperators.practice1;

/*
New java program to check if a Student gets a discount on it's own school lunch
Free students, pay $0.00;
Regular students pay $2.75;
ReducedPrice students pay only 50% $1.38;
 */

/*
Algorithm steps for the StudentLunchDiscountProgram,
1 Define 3x variables of type double ofc holding Student's attributes,
income (Store household income data), povertyLine (Store federal data),
lunchPrice (Store the calculated lunch price)

2 Define public static boolean method for checking Student's Lunch program Eligibility type



 */

public class StudentLunchDiscountProgram {

    public static void main(String[] args) {

        double income = 7000.0;
        double povertyLine = 12000.0;
        double lunchPrice;

        /*
        Determine lunch price based Eligibility
        Java Programming concept used: if-then else statements
         */
        if (income < povertyLine) {
            lunchPrice = 0.0;
            System.out.println("Student qualify for free lunch");
        }
        else if (income > povertyLine && income < 2 * povertyLine) {
            //Logical Operators conditions //2x povertyLine
            lunchPrice = 2.75/ 2; //Calculate reduced price (Half/full price)
            System.out.println("Student qualify for reducedPrice lunch: $" + lunchPrice);

        }
        else {
            lunchPrice = 2.75; // full price
            System.out.println("Student pays full price launch: $" + lunchPrice);
        };
    }


}
