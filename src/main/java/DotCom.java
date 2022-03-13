import java.util.ArrayList;
// This is the final, upgraded version of SimpleDotCom - however this contains just the DotCom objects to be used by DotComBust - which is the main application

public class DotCom {
    private ArrayList<String> locationCells;
    // No longer need numOfHits;

    // Changed int[] to an ArrayList of Strings
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    // Better argument name
    public String checkYourself(String userInput) {

        String result = "miss";

        // Check if user guess is in the ArrayList (indexOf returns -1 if it isn't)
        int index = locationCells.indexOf(userInput);

        // If true, the user guess is in the list, so remove it
        if (index >= 0) {
            locationCells.remove(index);

            // If the list is empty, then we killed it
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
