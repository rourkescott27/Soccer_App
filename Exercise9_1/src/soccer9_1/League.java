package soccer9_1;

public class League {
    public static void main ( String[] args ) {

        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        Game currGame = theGames[0];

        currGame.playGame();

        System.out.println(currGame.getDescription());

    }

//-----------------Methods------------------//

    public Team[] createTeams () {
        // Instantiating players for team 1
        Player player1 = new Player();
        player1.setPlayerName("George Elliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Greene");
        Player player3 = new Player();
        player3.setPlayerName("Geoffery Chaucer");
        // Array to hold player names
        Player[] thePlayers = {player1, player2, player3};

        // Instantiating team 1
        Team team1 = new Team();
        team1.setTeamName("The Greens");
        // Adding player names of team 1 to the Team class
        team1.setPlayerArray(thePlayers);


        // Instantiating team 2
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        // Adding player names of team 2 to the Team class
        team2.setPlayerArray(new Player[3]);
        // Instantiating players for team 2
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames ( Team[] theTeams ) {
        Game theGame = new Game();
        theGame.setHomeTeam(theTeams[0]);
        theGame.setAwayTeam(theTeams[1]);
        Game[] theGames = {theGame};
        return theGames;
    }

}
