public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

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

}
