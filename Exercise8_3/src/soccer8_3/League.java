package soccer8_3;

public class League {
    public static void main ( String[] args ) {

        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        Game currGame = theGames[0];

        currGame.playGame();

        System.out.println(currGame.getDescription());

        // Printing the score to the console
//        System.out.println("Goal scored after "
//                                   + currGame.goals[0].theTime + " mins by "
//                                   + currGame.goals[0].thePlayer.playerName + " of "
//                                   + currGame.goals[0].theTeam.teamName);
    }

//-----------------Methods------------------//

    public Team[] createTeams () {
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

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames ( Team[] theTeams ) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }

}
