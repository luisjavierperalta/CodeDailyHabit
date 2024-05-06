package switchstatements.practice1;

public class SwitchPractice1 {

    public static void main(String[] args) {

        int i = args.length;

        switch (i) { //Opening curly bracket of switch statement
            case 0 :
                System.out.println("No argument"); //Print = 0 arguments (value) in the Array (args)
                break;
            case 1 :
                System.out.println("Only one argument");
                break;
            case 2 :
                System.out.println("Two arguments");
                break;
            default:
                System.out.println("Too many arguments");
                break;

        } //Closing curly bracket of switch statement

        System.out.println("All done.");

        //Applying if, else statement version
        if (i == 0) {
            System.out.println("No argument");
        }
        else if ( i == 1) {
            System.out.println("Only 1 argument");
        }
        else if ( i == 2) {
            System.out.println("2 arguments");
        }
        else {
            System.out.println("Too many arguments");
        }
        System.out.println("All done!");
    }
}

