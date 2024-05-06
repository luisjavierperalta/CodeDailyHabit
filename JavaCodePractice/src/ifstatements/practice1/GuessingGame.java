package ifstatements.practice1;

import java.util.Random;
import java.util.Scanner; //Required import for Scanner Class from java.util API package library

public class GuessingGame {

    //Declare java's program main method
    public static void main(String[] args) {

        //Create a new instance of Scanner Class for user input
        Scanner keyboard = new Scanner(System.in);

        //Prompt user to enter a number to the console from keyboard
        System.out.println("Enter a number from 1 to 10"); //Ctrl + j for shortcuts mini-window

        //Next declare a new variable of type int, to store user input by calling nextInt() method to keyboard object
        int inputNumber = keyboard.nextInt(); //nextInt() for storing whole numbers, nextDouble() for n with decimals

        //Next declare a new variable of type int, for store a new instance of Random Class, to generate
        //random numbers within the range of 0 to 9 (10)  //Whole Numbers by calling nextInt(10) on new Constructor
        //Update to (10) +1 for a range of 1 to 10

        int randomNumber = new Random().nextInt(10) + 1;

        //Next declare an if statement for determine user's guess right or wrong
        //if right(true) display winning message, if false execute else block
        if (inputNumber == randomNumber) { //if (condition == true) execute block of code
            System.out.println("******");
            System.out.println("Congrats");
            System.out.println("******");

        } else { //Else block of code execute if (condition == false) //Display message for retry
            System.out.println("Sorry you lose");
            System.out.println("Random number is" + " " + randomNumber);
            System.out.println("Retry");

        }

        //Next out of else block && within the main method block, to display message for thanking of playing
        System.out.println("Thank your for playing");

        //IMPORTANT: When using the Scanner Class, always call the close() method on the Scanner object created
        //Beneficial for releasing & free up memory & system resources connect to the keyboard object
        keyboard.close();

    }


}
