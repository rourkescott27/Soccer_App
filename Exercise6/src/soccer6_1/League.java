package soccer6_1;

public class League {
    public static void main ( String[] args ) {
        // Instantiating players for team 1
        Player player1 = new Player();
        player1.playerName = "George Elliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffery Chaucer";

        // Array to hold player names
        Player[] thePlayers = {player1, player2, player3};

        // Instantiating team 1
        Team team1 = new Team();
        team1.teamName = "The Greens";

        // Adding player names of team 1 to the Team class
        team1.playerArray = thePlayers;

        //player1.playerName = "Robert Service";

        // Instantiating team 2
        Team team2 = new Team();
        team2.teamName = "The Reds";

        // Adding player names of team 2 to the Team class
        team2.playerArray = new Player[3];

        // Instantiating players for team 2
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";


        // For-loop iterating through all team one's players
        for(Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        // For-loop iterating through all team two's players
        for(Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }
    }
}
