package nestedloops;

/*
Java's program for practice Java Nested Loops with 2D Arrays
using A) Regular for loops
 */

//FIND THE SUM OF ELEMENTS

public class NestedLoops2DArrays3 {
    //ALGORITHM CHECKLIST OF STEPS

    public static void main(String[] args) { //1 
        //1.1 To declare & init 2D Array of int
        int[][] numbers = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        //2 To declare a variable of type int for storing SUM
        int sum = 0;

        //3 To define OUTER Regular for loop
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Sum of all elements" + sum);
    }
}
