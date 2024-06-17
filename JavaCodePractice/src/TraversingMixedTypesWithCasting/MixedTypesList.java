package TraversingMixedTypesWithCasting;

/*
Java exercise for practice traversing @ArrayList using MixedTypes Generics Objects & Typecasting
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MixedTypesList { //1

    //2.0 Java's main method
    public static void main(String[] args) {
        //2 Create & init @ArrayList List to hold MixedTypes of objects
        List<Object> mixedList = new ArrayList<>();
        //2.1 Adding elements to @mixedList
        mixedList.add("Good Morning");
        mixedList.add(42);
        mixedList.add(new BankAccount("004", "LuisJavierPeralta", 300000.0));

        //3 Create @Iterator for traversing the @mixedList List
        Iterator<Object> iterator = mixedList.iterator();
        //3.1 Traversing using while loop
        while (iterator.hasNext()) {
            Object object = iterator.next();
            //3.2 Typecasting into required Data Type
            if (object instanceof String) {
                String str = (String) object;
                System.out.println(str);
            }
            else if (object instanceof Integer) {
                Integer integer = (Integer) object;
                System.out.println(integer);
            }
            else if (object instanceof BankAccount) {
                BankAccount account = (BankAccount) object;
                System.out.println(account);
            }
            else {
                System.out.println("Unknown type");
            }
        }

    }


}
