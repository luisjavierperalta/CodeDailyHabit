package arrayandarraylistpractice1;

/*
REVERSE ARRAY
Java program for reversing an array using a While & Enhanced for loop
 */

public class ReverseArray {
    //ALGORITHM CHECKLIST OF STEPS
    //1 To declare java's program main method
    public static void main(String[] args) {
        //2 Declare & init array + variables
        int[] numbers = {1,2,3,4,5}; //2.1 Array of int with values required to reverse
        int left = 0; //2.2 Pointing to first element of array (numbers) act as index for "swapping process
        int right = numbers.length - 1; //2.3 Array last element index == array.length - 1; (zero-indexing)

        //3 Declare While loop to continue iterate until in (swapping process) "left" & "right" meet/cross

        while (left < right) { //As long as left < right, loop continues (0<4)
            //4 Swap elements
            int temp = numbers[left]; //Store current value of left temporary, to swap with element index right
            numbers[left] = numbers[right]; // Overwrite value at index left to value index right (reversing)
            numbers[right] = temp; //replace & store value from left to right (moving original element from left to right)
            //4.1 Elements left & right successfully swapped

            //5 Move left & right towards each other
            left++; //Move 1+ towards array ending
            right--;//Move -1 towards array beginning
            //Each iteration move them closer until meet & cross == swapping process for each pair
        }

        //6 Printing the reversed array
        System.out.println("Reversed array:"); //Print message first

        //7 Declaring an enhanced for loop to iterate each element in "numbers"
        for (int number : numbers) {
            System.out.print(number + "");
        }


    }
}
