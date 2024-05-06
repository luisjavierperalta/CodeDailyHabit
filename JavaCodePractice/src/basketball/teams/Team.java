package basketball.teams;

/*
Team.java Class:
Define Team.java public class within the "basketball.teams" package
Define 3 instance variables for Team name, Home City, and Coach Name
Import the Player.java class by define import statement:
import basketball.players.Player;
Define Team's class method for accessing Player's class static variable
 */

import basketball.players.Player;

import java.util.ArrayList;
import java.util.List;


public class Team {

    private String teamName;
    private String homeCity;
    private String coachName;
    private List<Player> players;

    //Constructor, getter & setter methods, and methods for add player, display team information

    //Constructor
    public Team(String teamName, String homeCity, String coachName) {
        this.teamName = teamName;
        this.homeCity = homeCity;
        this.coachName = coachName;
        this.players = new ArrayList<>();
        //COOL

    }

    public String getTeamName() {
        return teamName;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public String getCoachName() {
        return coachName;
    }


    //Method for demo access to Player's static field
    public void displayPlayerCount() {

        //Accessing the static variable totalPlayers directly from the Player's Class
        /*
        To access fields from the basketball.players package's Player class in the basketball
        teams package's Team class, you need to import the Player class and then use its fields accordingly.
         */
        int totalPlayers = Player.totalPlayers;
        //Printing total players in the league
        System.out.println("Total players in the league" + totalPlayers);

        /*
        The Team class imports the Player class using import basketball.players.Player;
        After importing, you can access the static variable totalPlayers from the Player class directly within
        the Team class methods, as demonstrated in the displayPlayerCount method;
        This way, you can access fields from the basketball.players package's Player
        class in the basketball.teams package's Team class.

         */
    }

    //Defining method to add players
    public void addPlayer(Player player) {
        players.add(player);

    }

    //Defining method to display Team Information
    public void displayTeamInfo() {
        System.out.println("Team :" + teamName);
        System.out.println("Home City:" + homeCity);
        System.out.println("Coach:" + coachName);
        System.out.println("Players: " + players);
        for (Player player : players) {
            System.out.println(">" + player.getName() + "Position :" + player.getPosition() +
                    "Jersey Number :" + player.getJerseyNumber());

        }

    }

    //Let's calculate average age of all players
    public static double calculateAverageAge(List<Player> players){
        //Let's define a variable to host totalAge count
        int totalAge = 0;

        //Let's define a for-each loop

        for (Player player: players) {
            totalAge += player.getAge();
        }
        return (double) totalAge / players.size();

    }




}
