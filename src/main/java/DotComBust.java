import util.GameHelper;
import util.SimpleGameHelper;

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
        }
    }
}
