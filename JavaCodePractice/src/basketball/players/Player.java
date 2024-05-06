package basketball.players;

import basketball.teams.Team;

/*
Exercise Title: Basketball Team Management
In this Java program we'll create two classes in different packages, then we'll
define instance & static variables in one class, and the other class will access those
instance variables (fields)

We'll create a Java program that models a Basketball Team Management System,
We'll define 2 classes: Player.java & Team.java within separate named packages :
basketball.players & basketball.teams

 */

/*
1 Player Class (basketball.players package)
Define a class named Player within the package "basketball.players"
Define instance variables for the player's name, age, position & jersey number
Define a static (class) variable to keep track total number of players

To define method for access Team's Class fields, required to define import statement;
import basketball.teams.Team;

 */
public class Player {

    private String name;
    private int age;
    private String position;
    private int jerseyNumber;
    public static int totalPlayers;



    /*
    Defining Constructor special method for creating real-world players based on the blueprint provided.
    We'll use the C to initialize newly created instances of Class "Player" to represent players
     */
    public Player(String name, int age, String position, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        totalPlayers++;


    }

    //Defining Getters & Setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }


    //Method for demo access to the Team's Class fields directly

     /*
         The method signature public void displayTeamInfo(Team team),
         the "Team" parameter named "team" serves the purpose of allowing the Player class to receive
         a reference to a "Team object".
         This parameter enables the Player class to access information about a specific team and display it.
         Here it referring to "team" for general demo only.
         "Team" parameter in the "displayTeamInfo" method enhances the modularity, flexibility,
         the Player class. It enables the method to display information about any team provided as an argument.

         1.1  By passing a "Team object" as a parameter to the "displayTeamInfo method", the Player class adheres
          to the "principle of encapsulation." Instead of directly accessing the fields of the Team class from
          outside, it receives a reference to the Team object, allowing controlled access to its information.

         1.2 The "Team" parameter provides "flexibility" to the "displayTeamInfo method". It can display information
          about "any team" passed to it as an argument.
          This flexibility allows the method to be reused for different teams "without modification".

          2 DEMO custom method signature implementation to access & display specific Team's name information

          public void displayTeamInfo(Team blueWolfTeam) {

          In this scenario, if you are accessing specific team information of blueWolfTeam from the Team.java class,
          you could name the "parameter" accordingly, such as "blueWolf or blueWolfTeam", to make it more descriptive.

         */
    public void displayTeamInfo(Team team) {

        //Access instance variables (fields) from the Team's Class
        String teamName = team.getTeamName();
        String homeCity = team.getHomeCity();
        String coachName = team.getCoachName();

        //Printing information to the console
        System.out.println("Team Name:" + teamName);
        System.out.println("Home City:" + homeCity);
        System.out.println("Coach Name:" + coachName);


    }


}
