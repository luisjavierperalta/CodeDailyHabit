package arrayandarraylistpractice1;

/*
1 Given int[] first = new int[3]; int[] second = {}; int[] third = null;
2 Print out the length of the 3 arrays
2 Print every element of the 3 arrays
 */
public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] first = new int[3];
        int[] second = {};
        int[] third = null;

        // Print the length of the arrays
        System.out.println("Length of first array: " + first.length);
        System.out.println("Length of second array: " + second.length); // 0 since it's an empty array
        System.out.println("Length of third array: " + (third != null ? third.length : 0)); // handle null pointer exception

        // Print every element of the first array
        System.out.println("Elements of first array:");
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
        }

        // Print every element of the second array (none since it's empty)

        // Print every element of the third array (null check required)
        System.out.println("Elements of third array:");
        if (third != null) {
            for (int i = 0; i < third.length; i++) {
                System.out.println(third[i]);
            }
        } else {
            System.out.println("Array is null.");
        }
    }
}