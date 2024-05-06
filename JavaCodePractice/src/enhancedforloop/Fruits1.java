package enhancedforloop;

/*
Java program that iterates over a collection of objects type (string) using
an ArrayList (DS) for practice for-each loop (enhanced for loop)
 */

import java.util.ArrayList;

/*
ALGORITHM CHECKLIST OF SEQUENTIAL STEPS:
1 To declare java's program main method
2 To create a new instance of the ArrayList Class (Collection) "fruits"
3 To add elements to the collection "fruits"
4 To declare a for-each loop (enhanced for loop) to iterate through each element
5 To Print each element of to the console
 */
public class Fruits1 {
    //1
    public static void main(String[] args) {

        //2 Create Instance of Arraylist Class
        ArrayList<String> fruits = new ArrayList<String>();
        //3 Add elements to "fruits" ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Oranges");

        //4 For-each loop for iteration
        for (String fruit : fruits) {
            //5 Printing elements of the collection
            System.out.println(fruit);

        }
    }

}
