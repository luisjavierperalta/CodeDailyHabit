package ifstatements.practice1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
/*
Java program to check password from user's input using Java conditional statements (if, else blocks)
Java programming concept's applied:
If,else statements (conditional control flow)
Java Scanner class for getting & read input from user
Double equal sign (==) & equals() method from the String Class for comparing objects (content equality)

 */

/*
ALGORITHM CHECKLIST:

1 Import required Java API packages (Classes)
2 Declare Java main method
3 Prompt User to enter input(password)
4 Create a new Scanner Class object (text)
5 Store the new Scanner object into a variable
6 Print a message to display "The password" entered
7 Declare if statement for comparing 2 Strings using (==) specifically object memory position
8 if true, execute a print statement: multi-line arguments using """ \n """;
8.1 include an else part with multi-line print arguments
9 Declare if statement for comparing 2 Strings using/ call equals method for (equality content)
10 if true, execute a print statement: multi-line arguments using """\n """;
10.1 to include else part with multi-line arguments print statement as well
11 To close the Scanner object using close(); within main block



 */
public class CheckPassword {

    //Java program main method
    public static void main(String[] args) {

        String realPassword = "GENIUS";

        //Prompt user to enter input
        out.println("Enter your password");
        //Create new instance of Scanner Class
        Scanner scanner = new Scanner(in);
        //Declare variable to store newly created text input
        String password = scanner.next(); //For storing text input

        //Print message to display password entered by user
        out.println("Your password is : " + password);

        //Declare if statement to compare 2 Strings (object pointing memory position)
        if (password == realPassword) {
            out.println("""
                   You entered a password pointing & stored as the real password.
                   You must be a hacker.""" ); //""" \n """ for text block

        }
        else { //Else block execute if condition = false;
            out.println("""
                    You entered a password stored in a different place from
                    the real password.
                    Not a problem.""");
        }

        //Declare 2nd if statement using equals() method for comparing 2 Strings (content)
        if (password.equalsIgnoreCase(realPassword)) {
            out.println("""
                    The password you entered has equals characters & content of the 
                    the real password. 
                    Allowed to enter our system.""");

        }
        else { // Execute only when if condition is false
            out.println("""
                    The password you entered has not equals characters & content of 
                    the real password.
                    Not allowed not enter our system.""");

        }

        //Out of the if-else blocks & within the main method to declare close() method on Scanner object
        scanner.close();

    }




}
