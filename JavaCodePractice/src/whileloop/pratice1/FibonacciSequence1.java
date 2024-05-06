package whileloop.pratice1;

/*
Java program to generate the Math Fibonacci Sequence up to a specific threshold limit number using a While Loop
Java programming's concept:
1 While Loop
2 Java Scanner Class
3 if Statement
 */

import java.util.Scanner;

public class FibonacciSequence1 {
    //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS
    //1 To declare java program's main method
    public static void main(String[] args) {

        /*
         2 Declare & init 3x variables (int) to hold first (value 0) , second (value 1) and
         sum of latest two numbers respectively
         */
        int firstNum = 0;
       int secondNum = 1;
       int sum = 0; //We'll update later within While Loop body

        //3 Prompt user to enter limit number for Fibonacci Sequence with Scanner Obj (new)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit number for the Fibonacci Sequence:");
        //4Read & store user input into a variable "limit" (int)
        int limit = scanner.nextInt();

        //5 To print beginning of Fibonacci sequence with limit, and initial two numbers
        System.out.print("Kick off of fibonacci sequence with limit" + limit);
        System.out.println("Initial two sequence numbers :" + firstNum + secondNum);

        //6 To declare a while loop to generate fibonacci sequence with infinity condition (true)
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
        }
        //7 To close Scanner obj to release system resources
        scanner.close();

        //8 Print message for finishing the program
        System.out.println("Fibonacci Sequence's program Complete!");
    }

}
