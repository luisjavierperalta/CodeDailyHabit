package arrayandarraylistpractice1;

/*
Java array don't have built-in method for inserting elements in the middle
Two common ways:
1 Using a new Array
2 Converting to ArrayList
 */

    public class InsertElementMiddleNewArray {

        //ALGORITHM CHECKLIST OF SEQUENTIAL STEPS
        //1 Declaring java's main
        public static void main(String[] args) {
            //2 Declaring original array of int
            int[] originalArray = {1, 2, 3, 4, 5};
            //2.1 Declaring two int variables to hold elementToInsert & InsertionPosition
            int elementToInsert = 10;
            int insertionPosition = 2; //before the element 3

            //5 Printing original array
            System.out.print("Original Array: ");
            for (int num : originalArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            //6 Calling InsertUsingNewArray method with arguments
            originalArray = insertUsingNewArray(originalArray, elementToInsert, insertionPosition);

            //7 Printing the newArray after inserting element 10
            System.out.print("New updated array: ");
            for (int num : originalArray) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

        //3 Declaring method for calculating new Array Length & Create new Array
        public static int[] insertUsingNewArray(int[] originalArray, int element, int position) {
            //3.1 NewArrayLength
            int newArrayLength = originalArray.length + 1; //1 represent the new element's egg slot
            //3.2 Creating a newArray with new length
            int[] newArray = new int[newArrayLength];

            //3.3 Copying elements from original array before insert element 10 using "Regular for loop"
            for (int i = 0; i < position; i++) {
                newArray[i] = originalArray[i]; //Copy & paste element from original to new at linked indexing
            }

            //3.4 Inserting the new element
            newArray[position] = element; //Insert position of new element (10) at specific newArray index
            //3.5 Copying & pasting remaining elements from original to new Array after insert of 10 (index 3)
            for (int i = position + 1; i < newArrayLength; i++) {
                newArray[i] = originalArray[i - 1];
            }

            //4 New array replacement with original array
            return newArray;
        } //CLOSING METHOD
    }

