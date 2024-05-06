package datatypes.exercise1;

import java.util.Scanner;

/*
The Java code below will calculate the Area & Perimeter of a rectangle based on
user inputs
 */

//1 Class definition, include any declaration required
//1.1 To check if package statement (first program statement) is declared
//1.2 To check if any import statement (second, before class def) is required & declared
// for ex. import java.util.scanner; is required.

public class AreaPerimeterCalculator {

    //Declare main method
    public static void main(String[] args) {
        /*
        1 statement within main method,
        To declare & create a new Scanner object for handling user input
         */
        Scanner scanner = new Scanner(System.in);

        /*
        2 statement, Prompt user for length
         */
        System.out.println("Enter the length of the rectangle (double DT):");
        double lenght = scanner.nextDouble();

        //3 statement within main method
        //Prompt user for width
        System.out.println("Enter thw width of the rectangle (double DT):");
        double width = scanner.nextDouble();

        //4 Statement within main method
        //To calculate area & perimeter of rectangle

        double area = lenght * width;
        double perimeter = 2 * (lenght + width);

        //Print results in the console
        System.out.println("The area of rectangle is" + area);
        System.out.println("The perimeter of rectangle is" + perimeter);

        // Close Scanner object (scanner) for resource management & optimization
        scanner.close();

    }


}
