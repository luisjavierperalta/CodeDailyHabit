package arrayandarraylistpractice1;

/*
Java program that reverse the elements of an array using a loop and swapping elements
Ex. Input array {1,2,3,4,5} / output array {5,4,3,2,1}
 */

public class ReverseArray2 {
    //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS
    //1 Declaring java's program main
    public static void main(String[] args) {

        //2 Declaring array of int(numbers) and two variables for holding first(left) & last elements(right)
        int[] numbers = {1,2,3,4,5};
        int left = 0; //Init with 0 for pointing to array's 1 element (zero-indexing)
        int right = numbers.length - 1; //Init with (n.l - 1) for pointing to "last element" == (length - 1 exclusive in java)

        //3 Declaring a while loop for iterating (swapping process on) through the array until meet the middle (left/right cross)
        while (left < right) {
            //3.1 Declare and init a temporary int variable (temp) to store the current left number
            int temp = numbers[left];
            numbers[left] = numbers[right]; //3.2 First part of swapping process
            numbers[right] = temp; //3.3 Second part of swapping process
            //4 Moving elements left & right to the next for new swapping pair at each iteration
            left++;
            right--;
        }
        //Printing the reversed array using a for-each loop
        System.out.println("Reversed Array:");
        for (int number : numbers) {
            System.out.print(number + ""); //Printing elements on a line
        }

    }
}
