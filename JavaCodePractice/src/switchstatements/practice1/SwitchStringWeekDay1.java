package switchstatements.practice1;

/*
Java program to demo a Switch Statement using String type literal as "Switch Expression" & Case Values
Java's programming concept's linked:
1 java.util.Scanner Class
2 String DT
3 switch statement using String type "switch expression" & case values

 */


import java.util.Scanner;

/*
Algorithm checklist:
1 To import any required Class from the Java API library
2 To declare java's program main method
3 To create a new instance of the Scanner Class
4 To declare & initialized a variable of type String named @Day with value @monday (switch expression)
5 To prompt user's to enter a text value(String) from Monday to Sunday
6 To re-assign @Day variable user's input for storage
7 To declare a new switch statement with case's options of type String
8 To print message "Good Job!" within MM
9 To call close() by invoking on the scanner obj for release linked system resources
 */
public class SwitchStringWeekDay1 {

    //Declare Java's program main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String weekDay; //String variable for the switch statement

        System.out.println("Enter a weekDay from Monday to Wednesday:");
        weekDay = scanner.nextLine();

        switch (weekDay) {
            case "Monday" :
                System.out.println("Today is Monday!");
                break;
            case "Tuesday" :
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday" :
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Invalid Day. Enter a day from Monday to Wednesday please!");

        }

        System.out.println("Welcome to myApp");
        scanner.close(); //Invoking the close() m for releasing system external or internal resources of Scanner obj
    }

}
