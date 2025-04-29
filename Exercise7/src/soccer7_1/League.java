package soccer7_1;

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

        // Creating a game and populating both teams
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        // Home team score added and goal time noted
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55.3;

        // Adding first goal to the array and then assigning the array to the goal object
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        // Printing the score to the console
        System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by "
                                   + currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName);


        //--------------EXERCISE 7---------------//

        // for-loop iterating through team 2's players using REGEX to find specified player and displaying their name
        for(Player thePlayer : team2.playerArray) {
            if(thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }

        //
        StringBuilder familyNameFirst = new StringBuilder();

        for(Player thePlayer : team1.playerArray) {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }


    }
}
