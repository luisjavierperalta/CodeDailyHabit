package operators.prepostincrement.practice2;

public class IncrementDecrementOperatorsWrappers1 {

    public static void main(String[] args) {

       //Apply Unary ++ & -- on numeric primitive wrappers
        // Wrappers object's immutable (expression's doesn't change wrapper itself) but
        //create new wrapper object as result assigned then to the reference variable on which is applied (++ or --)

        Integer i = 1;

        Integer j = i; //Now i + j point to same Integer memory address !
        i++; //A new wrapper object is created with value (2), then assigned to i
        //j WO still points to 1
        System.out.println(i +""+ j);
    }
}