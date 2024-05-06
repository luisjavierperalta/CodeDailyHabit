package operators.prepostincrement.practice2;



public class PrePostIncrementEx2 {

    //Declare & Initialize Java program main method
    public static void main(String[] args) {

        //Variable of type int declared & initialized with value of 1
       int a = 1;

       //Expression assignment into a
       a = a++ + ++a * --a - a--;
         //1 + (3 * 2) - 2;

       //Multiple increment & decrement operators ++,--;
        /*
        1 a++ (post-increment):
        Value of "a" (1) used in the expression first
        2 Then "a" is incremented by +1 (now 2);
        3 ++a (pre-increment):
        "a" is incremented by +1 (was 2, now 3);
        4 Then incremented value (now 3) is used in the expression
        5 --a (pre-decrement):
        "a" is decremented -1 (from 3) to 2
        Then decremented value (2) is used in the expression
        6 a-- (post-increment):
        The now value of "a" (now 2) is first used in the expression
        Then "a" is decremented by -1

        Order of Evaluation:
        /*
        Follow @PEMDAS, the expression is evaluated mostly from left to right

         */


        System.out.println(a); // Result is 0



    }
}
