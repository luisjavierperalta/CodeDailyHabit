package operators.prepostincrement.practice2;

//Java program to free practice Pre/Post Increment & Decrement Operators
public class IncrementDecrementQuiz3 {

    //Let's declare the java program's main method aka (Main.java file)
    public static void main(String[] args) {

        //Let's declare & initialize a variable of type int
        int i =0;

        //Expression Assignment to be solved
        i = i++ - --i + ++i - i--;
           //0 - 0 + 1 - 1 = result is 0

        /*
        Algorithm Checklist:
        1 i++ : value of i is used 0 (Now i = 1)
        2 --i: value of i is decremented -1 (Now i = 0)
        3 ++i : value of i in incremented by +1 (Now i = 1)
        4 i--: value of i is used 1 (final i = 0);

         */

        System.out.println(i);
    }
}
