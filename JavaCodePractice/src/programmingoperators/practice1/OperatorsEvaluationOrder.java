package programmingoperators.practice1;

/*
Simple java exercise for practice Java operators priority & associativity when evaluating programming math expressions.
2x step algorithm process,
1 Apply concept of priority & associativity for remove ambiguity (add parenthesis where required left or right)
90% java operators = left-associative 2 - 3 + 4 ( (2-3) + 4);

2 Begin java evaluation from left to right
 */

public class OperatorsEvaluationOrder {

    //Let's declare 3x uninitialized static bool variables
    static boolean a;
    static boolean b;
    static boolean c;

    //Let's declare the main method of the java program
    public static void main(String[] args) {

        //Let's declare a new boolean variable for storing expression result, by using static boolean variables
        boolean bool = (a = true) || ((b = true) && (c = true));
        // && has higher priority, we add parenthesis first, it evaluate first (true) || (true) = true (bool result)

        System.out.println(bool); //

        //New exercise
        String s1 = "hello";
        int i = 1;
        String s2 = s1 + 1 + i;
        System.out.println(s2);
        /*
        We got 3x strings, we grouped (s1 + 1) first = new string hello1 (Works because (+) operator overload),
        We add hello1 + i = new string hello11;

         */

        String str = "7" + 5 + 10;
        System.out.println(str);

        str = 7 + 5 + "10";
        System.out.println(str);

        str = "7" + (5 + 10);
        System.out.println(str);

        int m = 50;
        int n = ++m; //Result 51
        int o = m--; // Result 51 (Used now value)
        int updatedO = m; //Print 50 ( -1 updated)
        int p = --o + m--; //Result is 100
        System.out.println(p);

        int k = 4;
        boolean flag = k++ == 5; //False (Current value of K is 4)
        System.out.println(flag);

        flag = !flag; //True
        System.out.println(flag);



    }

}
