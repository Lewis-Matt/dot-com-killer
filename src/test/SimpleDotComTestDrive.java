// Primarily testing the checkYourself method, setLocationCells is just a setter, no need to test

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        // Initiate object
        SimpleDotCom dot = new SimpleDotCom();

        // Location of the dot-com (3 consecutive ints out of a possible 7)
        int[] locations = {2, 3, 4};

        // Invoke the setter method on the dot-com
        dot.setLocationCells(locations);

        // Make a fake guess
        String userGuess = "2";

        // Check userGuess
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            // if the fake guess (2) gives back a "hit", it is working
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
