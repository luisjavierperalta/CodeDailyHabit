package ifstatements.practice1;

import java.util.Scanner;

import static java.lang.System.out;



/*
Java program for simulating user's login authentication process sequentially by checking if input's
username & password match pre-configured combinations, therefore allowing access to the network system.
 */
/*
Java programming concept's linked:
1 Nested if,else statements
2 java.util.Scanner Class (java.util package)
3 java.lang.System.out obj (java.lang.System Class)

 */

/*
ALGORITHM CHECKLIST:
1 To declare any required import statement java.util.Scanner, java.lang.System.out
2 To declare the java program's main method (program entry point)
3 To create a new instance of the Scanner Class (to use "var" data type Java 10 feature update)
4 To prompt user to enter username (print statement)
5 To store user's input (username) into a variable of type String
6 To declare outer if, else statements, first
7 To declare nested if, else statements (execute only if the first outer is true)
8 To call the close() method from the Scanner obj to release system resources & optimization


 */
public class Authenticator2 {

    //Java program's main method
    public static void main(String[] args) {

        //Create a new instance (obj) of Scanner Class
        var scanner = new Scanner(System.in);

        //Prompt user for enter username
        out.println("Enter Username :");
        //Store username into a variable type String
       String username = scanner.next();

        //To declare outer if, else statement for check & authenticate username & password
        if (username.equals("bluewolf01")) { //OUTER IF
            out.println("Enter password :"); //Prompt user to enter password
            //To store password in a variable of type String
            String password = scanner.next();

            //Declare nested if,else statement for checking & authenticate password
            if (password.equals("MyBB2024")) { //INNER IF
                out.println("Cool! You're allowed to enter!");
            }
            else {
                out.println("Incorrect password");
            }


        }
        else { //Declare else statement if conditions is false (execute)
            System.out.println("Unknown user");

        }
    }

}
