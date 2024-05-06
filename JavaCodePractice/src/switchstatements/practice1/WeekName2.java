package switchstatements.practice1;

/*
Java program that takes user's input numbers from 0 to 6 (representing weekDays from Sunday to Monday), then
output corresponding day to the CLI (console).
Java programming concept's linked:
1 java.util.Scanner Class (To read user's input) from java.util package
2 switch statement (best syntax alternative to if, else statements for handling choice among multiple options)
 */

import java.util.Scanner;

/*
ALGORITHM CHECKLIST:
1 To declare any required import statement
2 To declare java's program main method
3 To create a new instance of the Scanner Class
4 To declare & initialized a variable of type int with value 0 (switch expression) for handling switch case options
5 To prompt user to input number from 0 to 6 ("Enter a weekDay number from 0 to 6")
6 To re-assign to weekNum variable the user's input value from scanner obj (storage)
7 To declare the standard java <14 switch statement
8 To close the Scanner obj with close() to release system resourses
 */
public class WeekName2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int weekNum = 0;

        System.out.println("Enter a weekDay number from 0 to 6:");
        weekNum = scanner.nextInt();

        switch (weekNum) {
            case 0 :
                System.out.println("Sunday");
                break;
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number! Enter a number from 0 to 6 please :");
                break;
        }

        scanner.close(); //To release any system resource connect to the Scanner Class obj
    }
}
