package switchstatements.practice1;

/*
Java program for creating a switch statement that takes CL-input's arguments & use
array indexing array[0] specifically at first position as switch expression
 */

/*
ALGORITHM CHECKLIST:
1 Declare the java's program main method
2 Declare a local variable of type int (value 0)
3 Declare the switch statement with expression String args array indexing 0 position args[0];
Switch Expression of String type > Indexing
4 To print i within main m
5 To enter CL-args for execute the program
 */
public class SwitchExamType1 {

    public static void main(String[] args) { //args Array of Strings used in the program required CL-args Inputs
       int i = 0;

       switch (args[0]) { //Array of Strings Indexing as Expression
           default :
               /*
               Switch begin with the default (allowed) + always execute since Java switch statement
               use top-down execution
                */

               i = i + 3;
           case "2" :
               i = i + 2;
           case "0" :
               break;
           case "1" :
               i = i + 1;

       }

        System.out.println("i is :" + i);
       // A) if array args[0] empty = Exception is thrown ArrayIndexOutOfBoundsException
        /*
        ArrayIndexOutOfBoundsException. This is because there are no elements in the array, so any attempt to access
         an index will be out of bounds. In the context of the provided code, if no command-line arguments
         are provided (args array is empty), accessing args[0] will throw this exception.
         */

        //B) Array of Strings args[0] with CL-arg "2" OUTPUT = 5
        //1 match with "2" = 2 + default (first case always execute)

    }
}
