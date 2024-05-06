package operators.prepostincrement.practice2;

public class IncrementDecrementQuiz2 {

    //Let's declare & initialize main method
    public static void main(String[] args) {

        //Let's declare and initialize 3x multiple variables of type int
        int a = 11, b = 22, c; // c is the result;

        //Let's declare & initialize the expression
        c = a + b + a++ + b++ + ++a + ++b;

        //11 + 22 + 11 + 22 + 13 + 24 = 103;

        /*
        1 a++: 11 is used, then +1 (Now a =12)
        2 b++: 22 is used, then +1 (Now b =23)
        3 ++a: 12 increment +1 (Now a = 13)
        4 ++b: 23 increment +1 (Now b = 24)
         */

        System.out.println("a = " + a);
        System.out.print("b =" + b);
        System.out.println("c =" + c);}
}
