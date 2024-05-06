package operators.prepostincrement.practice2;

/*
Java exercise that apply Increment/Decrement operators on (numeric) primitive wrappers
Java programming concept linked :
1 AUTO-BOXING
Assigning a primitive wrapper value (Wrapper Classes Integer, Double, Character) to a
primitive variable (int, double, char) for provide OOP features on top of primitive data.
2 Auto-boxing required only within 1 assignment or 2 method parameter arg passing
3 Wrapper object (immutable), primitive variables & WO still different things
after auto-boxing wrapper obj holds original value



 */
public class IncrementDecrementOperatorsWrappers2 {

    //To declare java program's main method
    public static void main(String[] args) {

        //Now let's declare and initialize 3x primitive wrapper variables
        Integer count = 5;
        Double value = 3.14;
        Character letter = 'a';

        //Now let's test pre-increment operator on count (++count)
        System.out.println("Pre-increment of count:"+ ++count); //Print 6 (5) +1, then used in the expression

        //OK cool let's test the post-increment operator on value (value++)
        System.out.println("Post-increment of value:" + value++);
        // Print 3.14 (original value used) then (3.14) +1 (Now value = 4.14)

        System.out.printf("Updated value after ++: %.2f", value); //Print 4.14 (2 decimals) after increment

        //Ok let's now print letter after post-decrement (no change for char)
        System.out.println("\n Updated value of a after post-decrement :" + letter);

        //Increment letter using its ASCII value
        letter++;
        System.out.println("\n"+ letter); //Print b (ASCII of 'a' +1)

        //Now let's perform Auto-boxing
        //Let's define a variable of type int, then assign to it the Integer wrapper object value of "count"
        int primitiveCount = count; //Conversion happened by creating a copy from the wrapper value (6)
        primitiveCount++; //We apply post-increment Now value used (5), then primitiveCount++(7) +1
        System.out.println("Primitive count after post-increment :" + primitiveCount);
        //Print 7 with boxed-back wrapper value (6) incremented result (Unboxing)

        //For explicit conversion from Integer Wrapper object to int primitive type
        //required intValue() method

        //Integer count = 5;
        int newValue = count.intValue(); //Convert Integer obj to int type
        int result = newValue * 2; //Now we're able to perform arithmetic operations on it
        System.out.println("\n Result:" + result);
    }
}
