package switchstatements.practice1;

// SwitchWeekDay2 program : same exercise using a method call from main method (boolean return type)
public class SwitchWeekDay3 {

    public static void main(String[] args) {

        //Let's call the isWeekDay method by passing a number (Argument)
        System.out.println(isWeekDay(8));

    }


    public static boolean isWeekDay(int dayNumber) {

        switch (dayNumber) {
            case 0 :
                return false; //Break don't required when using return
            case 1 :
                return true;
            case 2 :
                return true;
            case 3 :
                return true;
            case 4 :
                return true;
            case 5 :
                return true;
            case 6 :
                return false;
        }
        return false; //Represent classic default case
    }
}

