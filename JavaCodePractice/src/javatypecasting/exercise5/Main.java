package javatypecasting.exercise5;

//This Java program showcase how to perform widening & automatic type conversion

import java.util.Scanner;

/*
Algorithm to follow:
1 Initialize the program
2 Create an instance (object) of the Scanner class
3 Declare a variable
4 Ask the user to initialize it
5 Perform A) Widening or Automatic type conversion
6 Print the value for each data type
7 Complete
 */
public class Main {
    public static void main(String[] args) {

        //Take input from the user
        //Create a new object of Scanner class
        Scanner sc = new Scanner(System.in);
        //Ask user to enter the number
        System.out.println("Enter the number:");
        int i = sc.nextInt();

        //Widening or automatic type conversion from small to large
        long l = i; // 50
        float f = l; //50.0
        double d = f; //50.0

        System.out.println("After widening or automatic type, values are:");
        System.out.println("Int value"+ i);
        System.out.println("Long value"+ l);
        System.out.println("Float value"+ f);
        System.out.println("Double value"+ d);

        //OK let's run this java program, and enter a number


    }
}
