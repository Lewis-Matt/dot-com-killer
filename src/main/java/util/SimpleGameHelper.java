package util;

import java.io.*;

// This class serves to get the user input
public class SimpleGameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            // Enables us to minimize the number of I/O operations by reading chunks of characters and storing them in an internal buffer.
            // InputStreamReader configures BufferedReader to take any kind of input stream as an underlying source.
            // System.in typically corresponds to the input from the keyboard.
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            // Reads the content of the file/object
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
            // General class of exceptions produced by failed or interrupted I/O operations.
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

}
