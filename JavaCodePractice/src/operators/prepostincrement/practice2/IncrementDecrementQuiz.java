package operators.prepostincrement.practice2;

public class IncrementDecrementQuiz {

    //Let's declare main method
    public static void main(String[] args) {

        int i = 11;


        i = i++ + ++i;
        // 11 + 13; Result it 24
        //The expression step by step:
        /*
       1 i++: value of i(11) is used in the expression before increment +1 (Now i =12)
       2 ++i : value of i(now 12) is incremented first +1 (Now 13) then used in the expression


         */


        System.out.println(i);



    }


}
