package whileloop.pratice1;

import java.util.Scanner;

/*
Java program for practice by generating the Fibonacci Sequence up to a specific threshold limit,
using a While Loop.
Java's programming concepts linked:
1 Scanner Class
2 While loop
3 if statement ()
 */
public class FibonacciSequence2 {
    //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS

    //1 To declare java's program main method (application entry point)
    public static void main(String[] args) {

        //2 To declare 3x local (int) variables firstNum (0), secondNum(1) and sum, to hold respective values
        //To init sum with 0 (default), we'll update it later within while loop
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;

        //3 To create a new instance of Scanner Class (Obj)
        Scanner scanner = new Scanner(System.in);
        //3.1 To prompt user for input a threshold limit number for the Fibonacci Sequence
        System.out.println("Enter a limit number threshold for the Fibonacci Sequence:");
        //4 To read + store user's input into a variable (int) "limit"
        int limit = scanner.nextInt();

        //5 To print beginning FS & initial two numbers
        System.out.println("The Fibonacci Sequence begins now with limit number: \n" + limit);
        System.out.println("Two initial numbers of FS: " + firstNum + secondNum);

        //6 To declare the While loop for generate Fibonacci Sequence
        while (true) {
            //Loop body
            sum = firstNum + secondNum; //6.1 Add initial two numbers then stores it in variable sum
            //6.2 To declare if s, to check if "sum" exceed specific limit, if (true) declare a "break" keyword
            if ( sum > limit) {
                break;
            } //for exit the loop
            //6.3 Print sum
            System.out.println("sum" + sum);

            //6.4 To update value of firstNum & secondNum for upgrading the sequence & move forward
            firstNum = secondNum;
            secondNum = sum;
            /*
            0+1 =1
            1+1 =2
            1+2 =3
            secondNum : 2
            sum : 3
            2 (firstNum now) + 3 (secondNum) to getting ready for next loop iteration
            To push the Fibonacci Sequence forward
             */

        }

        //7 Out of loop body and within main method to call close() m on the scanner obj for releasing system resources
        scanner.close();

        System.out.println("Fibonacci Sequence's program Complete!");
    }

}
