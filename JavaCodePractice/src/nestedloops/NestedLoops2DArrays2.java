package nestedloops;

/*
Java's program for practice Java Nested Loops with 2D Arrays using B) For-each loops(Enhanced for loops)
 */
//PRINTING ALL NUMBERS

public class NestedLoops2DArrays2 {
    //ALGORITHM CHECKLIST OF STEPS
    //1 To declare java's main
    public static void main(String[] args) {
        //2 To declare & init 2D Array of int
        int[][] numbers = {{1,2,3}, {4,5},{6,7,8}};

        //3 To declare OUTER FOR-EACH LOOP
        for (int[] row : numbers) {
            for (int element : row) {
                System.out.print(element + "");
            }
            System.out.println(); //Move to next line after each row
        }
    }
}
