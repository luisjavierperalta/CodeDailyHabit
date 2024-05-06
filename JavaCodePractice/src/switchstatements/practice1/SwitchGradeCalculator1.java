package switchstatements.practice1;

/*
SwitchGradeCalculator1
Java program that takes a single-CL argument by the (String[] args) array of Strings, representing a Grade (A, B, C, D, F)
Next, it converts the argument provided into Char type variable (representing & named grade)
Next, Using a "Switch Statement" it assigns a score value (int type) based on the provided Char
for example (A score: 90) by deploying 5x case labels of switch options
Java programming concept's linked:
1 Main method CL-Argument inputs (String[] args) array
1.1 Array Indexing args[0], specifically char value charAt(0) stored
2 Switch Statement with ' Char' ('A') case labels
 */

/*
ALGORITHM CHECKLIST:
1 To declare java's program main method
2 To declare an if statement (for checking if user's provide 0 CL-argument), if true,
prompt use's to input a Grade with print statement
2.1 To declare "return" keyword (CONDITION) to close the program if, no CL-argument are provided

On the flip-side, if user input a CL-argument (Grade) before the return keyword, the program's next code
blocks execute
3 To declare a variable of type char (named grade), and initialized by accessing the CharAt(0) stored
within the String array index args[0] (args[0].charAt(0))
4 To declare a variable of type int (score) & initialized it with 0;
5 Next, To declare the switch statement with switch expression (grade)
5.1 To declare 5 case labels (Grades) A, B, C, D, F
5.2 If matches, execute: score assignment (score = A);
5.3 To declare default case, printing "Invalid Grade entered", then exits the program with return keyword;
6 To declare print statement within the main method for displaying "Grade : Score";
7 Next, To execute program by input CL-Argument

 */
public class SwitchGradeCalculator1 {

    //Java's program main method
    public static void main(String[] args) {
        //If statement for checking user's input (0 CL-argument) withing the whole String[] array (args.length)
        if (args.length == 0) { //Execute if true
            System.out.println("Enter a valid grade as CL-argument A,B,C,D,E:"); //Prompt user's to input CL-A Grade
            return; //(CONDITION) Terminate the program if 0 CL-Argument input from user in line 36
        }

        //Declare two local variables

        char grade = args[0].charAt(0);
        //args[0].charAt(0): This accesses the first character of the string stored in args[0].
        // Since args[0] is a string, .charAt(0) is used to retrieve the character at index 0 of that string.

        int score = 0; //Variable to store assigned score number into switch statement cases

        //Declare switch statement
        switch (grade) {
            case 'A' :
                score = 90; //Initialize variable
                break;
            case 'B' :
                score = 80;
                break;
            case 'C' :
                score = 70;
                break;
            case 'D' :
                score = 60;
                break;
            case 'E' :
                score = 50;
                break;
            default :
                System.out.println("Invalid Grade Entered");
                return; //Terminate the program
        }
        System.out.println("The Grade" + grade + ":" + score); //Display Grade & assigned score
    }
}
