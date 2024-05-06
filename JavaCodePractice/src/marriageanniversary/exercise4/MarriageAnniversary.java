package marriageanniversary.exercise4;

/*
Java program for representing number of anniversary between 2 married people based on
the number of years. Knowing they get married on February 29, which happened every 4 years
1 To declare & initialize member variable for storing nOfYears
2 To Print the number of anniversaries they had based on the nOfYears


 */
public class MarriageAnniversary {

    //Declaring program's main method
    public static void main(String[] args) {

        //Declaring & Init member variable to store nOfYears
        int numberOfYears = 12;

        //To print number of anniversaries based on nOfYears
        System.out.println("The number of anniversaries is " + numberOfYears / 4);
    }
}
