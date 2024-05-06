package operators.prepostincrement.practice2;

//Java program to solve post/pre-increment decrement problem
public class IncrementDecrementQuiz4 {

    //Let's define the java program's main method (Main.java file)
    public static void main(String[] args) {

        //Let's define 3x variables of type int
        int a = 2;
        int b = 5;

        //Expression assignment problem to be solved
        int c = a * (a++ - --b) * a * b;
        // 2 * (2 - 4) * 3 * 4 = result is -48
        // 2 * (-2) * 3 * 4;
        //-4 * 3 * 4;
        //-12 * 4;
        //-48 Let's go

        /*
        Algorithm checklist:
        1 a : value of a 2 is used (Now 2)
        2 a++: value of a is used 2 first (Now a = 3)
        3 --b : value of b is decremented to 6 & used (Now b = 4)
        4 No required operations left, only replace values in the
        expression
         */

        //Printing the result
        System.out.println(c);


    }
}
