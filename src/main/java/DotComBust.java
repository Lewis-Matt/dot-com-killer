import util.GameHelper;

import java.util.*;

// Main application - full version
// Makes instances of DotComs, uses SimpleGameHelper to get input
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // Make DotComs and give them locations
        DotCom one = new DotCom();
        one.setName("aol.com");
        DotCom two = new DotCom();
        two.setName("myspace.com");
        DotCom three = new DotCom();
        three.setName("mapquest");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("It is 2001, and you are the VP in charge of hostile takeovers. \n" +
                "Your goal is to remove market competition by sinking dot-coms.");
        System.out.printf("Try to sink %s, %s, and %s in the fewest amount of guesses in order to earn your bonus.%n", one.getName(), two.getName(), three.getName());

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } //forEach
    } // setup

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        } // while
        finishGame();
    } // startPlaying

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;

        String result = "miss";

        for (int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        } // for
        System.out.println(result);
    } // checkUserGuess

    private void finishGame() {
        System.out.println("All Dot Coms are bankrupt! You are now a monopoly!");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " contracts to bankrupt them!");
            System.out.println("You were able to insider-trade (ahem, I mean 'speculate') and turn a profit on shorting the dot coms!");
        } else {
            System.out.println("Took you long enough... " + numOfGuesses + " contracts had to be signed in order to bankrupt them.");
            System.out.println("Your short options expired out of the money.");
        }
    } // finishGame

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    } // main
} // class
