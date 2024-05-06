package switchstatements.practice1;

/*
Java program that takes an input number from 0 to 6 (represent day of week from Sunday to Monday) and output
corresponding name of the day
Java programming concept's linked:
1 java.util.Scanner Class (import required) for read user's input
2 Switch statement (Standard version Java <14

 */
/*
ALGORITHM CHECKLIST:
1 To declare a public class named WeekName
2 To declare java's program main method (App entry point)
3 To Create a new instance of the Scanner Class
4 To declare & initialized a variable of type int (switch expression) for handling switch case matching
5 To prompt user to enter a day number
6 To re-assign user's input to the declared switch ex. variable
7 To declare the switch statement
 */


import java.util.Scanner;

public class WeekName {
    //Declare java's program main method
    public static void main(String[] args) {

        //Create a new instance of the Scanner class for read user's input
        Scanner scanner = new Scanner(System.in);
        //Declare & initialized the "switch expression" variable of type int
        int dayNum = 0; //Default value for handling any errors in case user don't provide input
        //Prompt user to enter a number from 0 to 6
        System.out.println("Enter a WeekDay number from 0 to 6:");
        dayNum = scanner.nextInt(); //Read user input then stores it in dayNum variable

        //Declare switch statement
        switch (dayNum) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default: //if value of dayNum doesn't match any case (from 0 to 6) default case execute like else statement
                System.out.println("Invalid input, please enter a number from 0 to 6!");
                break;
        }


    }
}
