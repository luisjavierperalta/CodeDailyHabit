package operators.prepostincrement.practice2;

public class IncrementDecrementQuiz5 {

    public static void main(String[] args) {

        //Let's declare & initialize 3x variables of type int
        int i = 19;
        int j = 29;
        int k;

        //Now let's solve the below puzzle
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        //19(18) - 18(19) + 28 - 29 + 18 - 28 (27) + 19 - 27(28);
        //

        System.out.println(k);

        /*
        Algorithm Checklist:

         */
    }
}
