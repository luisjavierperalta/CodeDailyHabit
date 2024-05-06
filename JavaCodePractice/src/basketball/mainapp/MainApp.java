package basketball.mainapp;

import basketball.players.Player;
import basketball.teams.Team;

public class MainApp {

    //Now let's define main method of the java program
    public static void main(String [] args) {

        //OK let's create Players
        Player player1 = new Player("Lebron James", 36, "Forward",23);
        Player player2 = new Player("Stephen Curry", 36, "Guard", 30);
        Player player3 = new Player("Kevin Durant", 33, "Forward", 7);

        //OK Cool let's create Teams

        Team lakers = new Team("Los Angeles Lakers", "Los Angeles", "Frank Vogel");
        Team warriors = new Team("Golden State Warriors", "San Fransisco", "Steve Kerr");

        //OK Cool let's add players to teams
        lakers.addPlayer(player1);
        warriors.addPlayer(player2);
        warriors.addPlayer(player3);

        //Now let's display Team information
        System.out.println("Lakers Team Info:");
        lakers.displayTeamInfo();

        System.out.println("\n Warriors Team Info:");
        warriors.displayTeamInfo();

        //COOL! Let's test this program

        //Cool



    }


}
