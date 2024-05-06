package switchstatements.practice1;

/*
Java program exercise to practice switch statement using :
A) Standard Java <17 switch statement
B) Direct method call from main method (Boolean return type)

The program takes a number input from user from 0-6 (Sunday to Saturday) than return/ output
if the Day is a Week Day (Boolean)
if the Day is Week Day or Weekends
 */

import java.util.Scanner;

/*
ALGORITHM CHECKLIST:
1 To declare the java's program main method
2 To create a new instance of the Scanner Class for reading user's input (System.in)
3 To prompt user to Enter a number from 0-6 (WeekDays)
4 To declare a variable to store user's input (nextInt()) isWeekDay variable
5 To declare a switch statement with isWeekDay variable
6 To declare 6 case + default ("Invalid Number") 5 for WeekDays + 2 for Weekends

B)
 */
public class SwitchWeekDay2 {

    //Declare the java's program main method
    public static void main(String[] args) {

        //New instance (obj) of Scanner Class creation
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a WeekDay number:"); //Prompt user to enter a WeekDay number
        int isWeekDay = scanner.nextInt(); //Store user's input number into a variable (isWeekDay)

        //Declaring switch statement
        switch (isWeekDay) {
            case 0 :
                System.out.println("Weekend: Sunday!");
                break;
            case 1 :
                System.out.println("WeekDay: Monday!");
                break;
            case 2 :
                System.out.println("WeekDay: Tuesday!");
                break;
            case 3 :
                System.out.println("WeekDay: Wednesday!");
                break;
            case 4 :
                System.out.println("WeekDay: Thursday!");
                break;
            case 5 :
                System.out.println("WeekDay: Friday!");
                break;
            case 6 :
                System.out.println("Weekend: Saturday!");
                break;
            default:
                System.out.println("Invalid Number: Please enter number from 0-6!");
                break;


        }

    }

    //Now let's create same exercise using a method call from main method
    public static boolean isWeekDay(int dayNumber) {

        switch (dayNumber) {
            case 0 :
                return false; //Break don't required when using return
            case 1 :
                return true;
            case 2 :
                return true;
            case 3 :
                return true;
            case 4 :
                return true;
            case 5 :
                return true;
            case 6 :
                return false;
        }
        return false; //Represent classic default case
      }
    }
