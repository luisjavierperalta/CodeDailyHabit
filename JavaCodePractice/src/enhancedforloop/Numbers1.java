package enhancedforloop;

/*
Java for each (enhanced for loop) for practice iterating & printing each element of
a collection of objects (int) type using an ArrayList (DS)
 */

import java.util.ArrayList;

/*
ALGORITHM CHECKLIST OF SEQUENTIAL STEPS:
1 Declare Java's program manin method
2 Create a new instance of ArrayList Class of type <Integer> "numbers"
3 Add 5 elements to the ArrayList "numbers"
4 Iterate over the ArrayList with a for-each loop
5 Print each element to the console

 */
public class Numbers1 {
    //1
    public static void main(String[] args) {

        //2
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //3 adding elements to the collection of objects
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //4 Declaring a for-each loop
        for (int number : numbers) {
            //5 Print each element to the console
            System.out.println(number);

        }

    }

}
