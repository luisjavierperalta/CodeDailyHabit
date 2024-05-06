package arrayandarraylistpractice1;

import java.util.ArrayList;
import java.util.Objects;

/*
//MIXED LIST WITH TYPECASTING
Java program that creates an ArrayList of mixed elements types, next
iterates through the list with an Enhanced for loop, next Typecast each element
with own correct type within loop body.

 */
public class MixedListWithTypecasting {
    //1 Declaring the java's program main
    public static void main(String[] args) {

        //2 Create an ArrayList of Objects (Generics type)
        ArrayList<Object> mixedList = new ArrayList<>();
        //3 Add elements of different types to @mixedList
        mixedList.add("Hello");
        mixedList.add(123);
        mixedList.add(3.14);
        mixedList.add(true);

        //4 Iterate through @mixedList & typecast each element using an enhanced for loop
        for (Object obj : mixedList) {
            //Loop body
            //4.1 Check if element is of type String
            if (obj instanceof  String) {
                String string1 = (String) obj; //Typecasting obj into String
                System.out.println("String:" + string1); //Printing string to the console
            }
            //4.2 Check if element is of type Integer
            else if (obj instanceof Integer) {
                int number = (Integer) obj; //Typecasting obj to Integer
                System.out.println("Integer:" + number);
            }
            //4.3 Check if element is of type Double
            else if (obj instanceof Double) {
                double dbl = (Double) obj; //Typecasting obj into Double (Wrapper Class of double)
                System.out.println("Double:" + dbl);
            }
            //4.4 Check if element is of type Boolean
            else if (obj instanceof Boolean) {
                boolean bool = (Boolean) obj; //Typecasting obj into Boolean Wrapper Class
                System.out.println("Boolean:" + bool);
            }
        } //CLOSING ENHANCED FOR LOOP

    }
}
