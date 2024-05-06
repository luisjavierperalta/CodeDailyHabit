package switchstatements.practice1;

/*
 To check exercise v1 for full introduction & algorithm checklist
 */
public class SwitchGradeCalculator2 {

    //Java's program main m
    public static void main(String[] args) {

        //Declare if statement to check args.length (size) == to 0 CL-arg (empty)
        if (args.length == 0) {
            System.out.println("Enter a valid Grade Choice A,B,C,D,E,F :");
            //Prompt user to supply valid CL-arg to prevent javac of throw Exception type >ArrayIndexOutOfIndex Ex.
            return; // (condition) return keyword to terminate program if 0 CL-args supplied
        }

        //Declare two local variables
       char grade = args[0].charAt(0); //Access & assign CL- input value ('A') the first of string stored args[0]
        int score = 0; //Variable to store score value of grade (A = 90)

        //Declare switch statement
        switch (grade) {

            case 'A' :
                score = 90; //Init score & assign value to 'A' grade
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
            default:
                System.out.println("Invalid Grade: Enter Grade from A-E");
                return; //Terminate the program

        }

        //Print Grade & Score associated
        System.out.println("Grade"  + grade + ":" + score);
    }
}
