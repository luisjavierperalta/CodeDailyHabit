package elevatorweightlimit.exercise3;

/*
Java program that calculate number of people capable to fit into an
elevator based on the ElevatorMaxWeight limit & Weight of a 1x Person.
1 To declare & initialize 3x member variables, to represent a person weight, elevator weight & nOfP capability result
2 To print the nOfP capability using print & println


 */
public class ElevatorWeightLimit {

    //Declare main.java method of the program
    public static void main(String[] args) {

        //Declaring & initializing member variables
        int personAverageWeight = 150;
        int ElevatorMaxWeightLimit = 1400;
        int numberOfPeopleCapability = ElevatorMaxWeightLimit / personAverageWeight;

        //Print nOfPC message
        System.out.print("The maximum number of people limit is");
        System.out.print(" " + numberOfPeopleCapability);
        System.out.println(" " + "to fit safely into the Elevator");

    }
}
