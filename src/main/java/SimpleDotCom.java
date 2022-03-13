import util.GameHelper;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    // Setter method for setting the cell location
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    // Get user guess, check it against dot-com positions, track # of guesses
    public String checkYourself(String stringGuess) {
        //  Get the user guess - convert to int
        int guess = Integer.parseInt(stringGuess);

        // Holds the result, defaults to miss
        String result = "miss";

        // Repeat for every possible location in the int array
        for (int cell : locationCells) {
            // Compare user guess to the cell in the array
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                // Exit the loop, no need to test the other cells
                break;
            }
        }
        // Check if guess was the last cell (i.e. did we hit 3 dot-coms), set result to "kill"
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        // Print the result (miss default, unless set to hit or kill from above logic)
        System.out.println(result);
        // Return result to the calling method
        return result;
    }

    // MAIN - Execution
    public static void main(String[] args) {
        // Variable for tracking # user guesses
        int numOfGuesses = 0;

        // Get user input
        GameHelper helper = new GameHelper();

        // Instantiate SimpleDotCom object (our game)
        SimpleDotCom theDotCom = new SimpleDotCom();

        // Random number for the first cell, used to make the cell locations array
        // Math.random() returns a double between 0 to < 1. *5 would be 0 to < 4.99, cast as int gives 0 to 4.
        int randomNum = (int) (Math.random() * 5);

        // Random locations for the dot-coms
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);

        // Variable to track whether the game is still alive
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");

            // Check the guess, save to a String
            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            // If we killed the dot-com, set isAlive to false so we exit the loop, print out # guesses
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("It took you " + numOfGuesses + " guesses to squash the startup.");
            }
        }
    }
}