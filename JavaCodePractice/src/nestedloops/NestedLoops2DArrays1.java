package nestedloops;

/*
Java's program exercise for practice Nested Loops with 2D Arrays
//PRINTING ALL ELEMENTS
 */
/*
The program iterate through a 2D Array, next print all elements using A) Regular for loops B) For each loops
 */

public class NestedLoops2DArrays1 {
    //ALGORITHM OF SEQUENTIAL STEPS A
    //1 To declare java's program main method (entry point of execution)
    public static void main(String[] args) {

        //2 To declare & init 2D Array of int named "numbers"
        int[][] numbers = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        //3 To declare Outer loop (Regular for loop)
        for (int i = 0; i < numbers.length; i++) { //OUTER LOOP
            //4 To define Inner loop (Regular for loop)
            for (int j = 0; j < numbers[i].length; j++) { //INNER LOOP
                System.out.print(numbers[i][j] + "");
            }
            System.out.println(); //Moves to the next line after each printed row
        }
    }
}
