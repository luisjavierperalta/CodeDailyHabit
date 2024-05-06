package ifstatements.practice1;

/*
Java program to check if user's input number (int), is whether positive or negative
Java programming concepts linked:
1 java.util.Scanner Class for read user's input
2 If, else statements for check if number -/+
 */

import java.util.Scanner;

/*
ALGORITHM CHECKLIST:
1 To Declare java program main method (application entry point)
2 To Create a new instance (obj) of the Scanner class
3 To prompt user's to "Enter a number" (whole number)
4 To store user's input into a variable of type int
5 To declare if, else statement to check number polarity, then print results

 */
public class CheckPositiveNumber {

    //Java's program main method
    public static void main(String[] args) {

        //Create a new instance of Scanner Class
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter an int number
        System.out.println("Enter a number :");
        int number = scanner.nextInt(); //Store user's input into a variable type int

        if (number < 0 ) {
            System.out.println("Number is negative!" + number);
        }
        else {
            System.out.println("Number is positive!" + number);
        }

        //To close Scanner obj to release system resources linked to scanner obj
        scanner.close();
    }
}
