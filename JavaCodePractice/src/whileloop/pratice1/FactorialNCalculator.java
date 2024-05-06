package whileloop.pratice1;

import java.util.Scanner;

/*
Java program to calculate the factorial of a given number (n). The program specifically prompt user to enter
a factorial number (limit), Next calculate factorial of n with a While loop, Next it iterates from 1 to n
multiplying each number less or equal to n, Next it prints the factorial

Java's programming concepts linked:
1 While loop
2 Scanner Class
3
 */
public class FactorialNCalculator {
    //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS
    //1 To declare java's program main m
    public static void main(String[] args) {

        //2 To declare 2x (int) variables, number (uninitialized) for store user's input, factorial (1 starting point),
        int number;
        int factorial = 1;

        //3 To declare new Scanner class obj, for prompting user's to input factorial number (limit)
        Scanner scanner = new Scanner(System.in);
        System.out.println("To Enter a factorial Number:");
        //4 To read & store factorial user's input n into variable "number"
        number = scanner.nextInt(); //number gets initialized

        //5 To declare while loop for calculate factorial of n
        int i = 1; //Loop iterations counter (represent each int in the n range & updates multiplication for factorial)

        while (i <= number) { //Loop continue as long as i (n) <= number (limit) each iteration (new product update)
            factorial *= i; //Compound assignment of product for factorial sequence update
            i++; //Update for each iterations for advancing the index from 1 to the n (user's input

        }
       //6 To print factorial number to CL
        System.out.println("Factorial number is:" + factorial);
    }
}
