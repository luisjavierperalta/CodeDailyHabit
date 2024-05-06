package javatypecasting.exercise5;

//This Java program showcase how to perform widening & automatic type conversion

import java.util.Scanner;

/*Algorithm to follow:
        1 Initialize the program
2 Create an instance (object) of the Scanner class
3 Declare a variable
4 Ask the user to initialize it
5 Perform Narrowing or Manual Explicit type conversion
6 Print the value for each data type
7 Complete
 */
public class Main2 {

    public static void main(String[] args) {

        //Take input from users by creating a new obj of Scanner Class
        Scanner sc= new Scanner(System.in);

        //Ask users to enter a number
        System.out.println("Enter a number:");
        double d = sc.nextDouble();

        //Now let's perform a Narrowing Explicit type conversion
        float f = (float) d; //Explicit typecasting from large to small Double to Float
        long l = (long) d;
        int i = (int)l;

        //Let's print an output message
        System.out.println("Values after Narrowing Explicit Typecasting are:");
        System.out.println(" Double value" + d); //Fractional part lost
        System.out.println(" Float value:" + f);
        System.out.println(" Long value:" + l);
        System.out.println(" Int value: " + i);

        //Let's run, & test this java program by entering a value
    }
}
