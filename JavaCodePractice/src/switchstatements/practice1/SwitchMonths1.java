package switchstatements.practice1;

/*
Java program that takes numbers from 1-12 CL-args (String[] args), to represent yearly months (12);
Using a switch statement based on the number provided, the program print linked MonthName
Java programming concept's linked:
1 Java switch statement with int variable
2 Integer.parseInt(args[0]): This method parseInt() is a static method of the Integer class in Java.
 */

/*
ALGORITHM CHECKLIST:
1 To declare java's program main method
2 To declare if statement to check (args.length == 0) user's supply 0 CL-arguments, if true
3 To prompt user to supply CL-arg number from 1-12 for prevent javac of throw Exception
type >ArrayIndexOutOfIndex Ex.
4 To declare return; keyword (CONDITIONS) to terminate program is above still true
5 Next, to declare two variables
5.1 monthNumber int type for storing the int conversion result of args String input (Integer.parseInt(args[0]))
5.2 monthName uninitialized; will be init later within Switch's cases options
6 Next, to declare switch statement with 12 options, which execute assignment of monthName;
7 To print monthNumber : equivalent monthName
 */

public class SwitchMonths1 {

    //Java's program main m
    public static void main(String[] args) { //main block of code

        //Declare if statement to check if 0 CL-args supplied (true)
        if (args.length == 0) {
            System.out.println("Please Enter a CL number from 1-12 to get linked yearly month:");
            //Prompt if condition is true for prevent javac of throw Exception
            //type >ArrayIndexOutOfIndex Ex.
            return; //return k to terminate program by exiting main method
        }

        //Declare two variables
        int monthNumber = Integer.parseInt(args[0]); //Store the int conversion of String at index args[0]

        String monthName = null;

        //Declare switch statement
        switch (monthNumber) {
            case 1 :
                monthName = "January";
                break;
            case 2 :
                monthName = "February";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            case 5 :
                monthName = "May";
                break;
            case 6 :
                monthName = "June";
                break;
            case 7 :
                monthName = "July";
                break;
            case 8 :
                monthName = "August";
                break;
            case 9 :
                monthName = "September";
                break;
            case 10 :
                monthName = "October";
                break;
            case 11 :
                monthName = "November";
                break;
            case 12 :
                monthName = "December";
                break;
            default:
                System.out.println("Invalid number! Please enter a number from 1-12.");
                break;

        }

        //Print monthNumber & linked monthName
        System.out.println("The monthNumber" + monthNumber + "is linked to:" + monthName);


    }
}
