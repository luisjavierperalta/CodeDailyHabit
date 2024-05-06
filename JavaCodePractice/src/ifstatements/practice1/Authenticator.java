package ifstatements.practice1;

/*
Java program that prompt user to input username & password using GUI windows, and check if credentials match
predefined values, based on result it then display a message using GUI window.
Java programming concepts linked:
1 javax.swing package & JOptionPane Class (GUI)/ FQCN : javax.swing.JOptionPane;
2 JOptionPane.showInputDialog (GUI alternative of Scanner Class CLI-based for reading & storing user's input)
2.1 OptionPane.showMessageDialog (GUI alternative for display messages using a GUI window)
3 If,else statements w/ java logical operators (&&, ||, !);

 */
/*
ALGORITHM CHECKLIST:
1 To import any required Java API package & library @javax.swing.JOptionPane;
2 To Declare Java's program main method (Program entry point of execution)
3 To store user's input (text) Username & Password using JOptionPane Class and Store it in respective variables
4 To declare if statement checking multiple conditions & else statement authenticate user's username-password validity
5 To display message for ending the program "Welcome to myApp!"

 */

import javax.swing.*;

public class Authenticator {

    //Java's program main method declaration
    public static void main(String[] args) {

        //To create a new GUI window for read & store user's input (Username)
        String username = JOptionPane.showInputDialog("Username :");
        //Next let's repeat for password
       String password = JOptionPane.showInputDialog("Password :");

       int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));


       //Next let's declare if, else statement
        if (username != null && password != null &&
                (//Check logical conditions first
                // Ensures that both username and password are not null.
                (username.equals("bluewolf01") && (password.equals("BW1123581321@")) ||

                        (username.equals("LuisJavierPeralta")) &&
                                (password.equals("BW1123581321@"))
                )
                ))
        {
            JOptionPane.showMessageDialog(null ,"Welcome to MyApp! You're in" );
            //If the conditions are met (True), this line displays a
            // GUI window box with the message "You're in." indicating successful authentication.
        }

        else  if (age > 18) {
            JOptionPane.showMessageDialog(null ,"You're allowed to enter the party" );
        }

            else {
            JOptionPane.showMessageDialog(null, "You're Suspicious");
        }

    }
}
