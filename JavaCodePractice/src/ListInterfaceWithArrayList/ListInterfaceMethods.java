package ListInterfaceWithArrayList;

/*
This a class for practice @ListInterface using an @ArrayList/ and Methods from the @java.util.List Interface
REQUIRED:
import java.util.ArrayList; @Auto-imported by @Intellij
import java.util.List; //Auto-imported by @Intellij
 */


import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods { //1 Class declaration
    //2 Main method definition
    public static void main(String[] args) {
        //3 Creating an instance of the ArrayList class
        List<String> fruits = new ArrayList<>();
        //4 Adding elements to the @ListInterface
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        //5 Printing the List
        System.out.println("Printing the List of fruits:" + fruits);

        //6 Adding elements to a @specific index @fruits.add(element)
        fruits.add(1, "Orange");
        System.out.println("Printing updated List:" + fruits);

        //7 Access element by @specific index @fruits.get(index);
        String fruitIndex2 = fruits.get(2);
        System.out.println("Element at index 2 :" + fruitIndex2);

        //8 Replace element by @specificIndex @fruits.set(index, element);
        fruits.set(2, "Blueberry");
        System.out.println("Updated fruits list:" + fruits);

        //9 Remove element by @specificIndex @fruits.remove(index);
        String removedFruit = fruits.remove(3);
        System.out.println("Removed element index 3:" + removedFruit);
        System.out.println("Updated List of Fruits:" + fruits);

        //10 Find the index of an element @fruits.indexOf("Apple");
     int indexOfApple = fruits.indexOf("Apple"); //Index is of type int
        System.out.println("Index of Apple:" + indexOfApple);

        //10.1 Adding new Apple element at last index position of fruits @fruits.add("element");
        fruits.add(2, "Apple");
        System.out.println("Updated List of fruits:" + fruits);

        //11 Find last index of an element @fruits.lastIndexOf("Element);
        int lastIndexOfApple = fruits.lastIndexOf("Apple");
        System.out.println("\n Updated List of fruits:" + lastIndexOfApple);
        System.out.println("Updated List of fruits:" + indexOfApple);

        //12 Get a subList of List @fruits.subList(index);
        List<String> subList = fruits.subList(0,2);
        System.out.println("Sublist:" + subList);

        //13 Check if list contains an element @fruits.contains("element");
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains Apple:" + containsApple);

        //14 Iterating over the list @fruits w/ enhanced for loop
        System.out.println("Iterating list @fruits:");

        for (String fruitElement : fruits) {
            System.out.println(fruitElement);
        }



    }

}
