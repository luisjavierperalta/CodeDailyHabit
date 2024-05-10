package arrayandarraylistpractice1;

/*
1 Create an Array of booleans of length 3 inside the main method.
2 Print the elements of the array without initializing the array elements explicitly.
3 Comment the output
 */

public class ArrayExercise1 {
    //ALGORITHM OF SEQUENTIAL STEPS
    //1 main
    public static void main(String[] args) {
        //2 Creating array of booleans of length 3
        boolean[] booleanArray = new boolean[3];

        //3 Printing the elements of the array using a for-each loop
        for (Boolean element : booleanArray) {
            System.out.println(element); //Prints false, false, false == Default init values
        }
    }
}
