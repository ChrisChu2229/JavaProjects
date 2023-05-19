// This is the package declaration. All Java classes are part of a package.
// It provides a namespace and organizes the files into directories.
package Day_One_Primitives_And_Objects;

// This line imports the Scanner class, which is used to read input data from various sources (like keyboard input).
import java.util.Scanner;

// This is the beginning of the class declaration for StoryMaker.
public class StoryMaker {
    // The main method is the entry point for any Java application.
    // The JVM starts executing the program by calling the main method.
    public static void main(String[] args) {
        // This creates a new Scanner object that reads from standard input (keyboard).
        Scanner scanner = new Scanner(System.in);

        // This is a string that represents the initial story template, with
        // placeholders in brackets.
        String story = "Once upon a time there was a [adjective] [noun] who lived in [city].";

        // This is the beginning of a loop that will continue indefinitely until it's
        // manually stopped.
        while (true) {
            // These two lines find the position of the first and second brackets in the
            // string.
            int pos1 = story.indexOf("[");
            int pos2 = story.indexOf("]");

            // This if-statement checks if either bracket is missing (-1 means that the
            // bracket was not found).
            // If either is missing, the program breaks out of the while loop.
            if (pos1 == -1 || pos2 == -1) {
                break;
            }

            // This line gets the text between the two brackets to use as the prompt.
            String prompt = story.substring(pos1 + 1, pos2);
            // This line prints the prompt and waits for the user's input.
            System.out.print(prompt + ": ");
            // This line reads the next line of input from the user.
            String word = scanner.nextLine();
            // This line replaces the text in the brackets with the user's input.
            story = story.substring(0, pos1) + word + story.substring(pos2 + 1);
        }

        // This line prints the final story after all placeholders have been replaced.
        System.out.println(story);

        // This closes the scanner, freeing up resources. Leaving scanners open can lead
        // to resource leaks.
        scanner.close();
    }
}
