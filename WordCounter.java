import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Get a sentence from the user
        String sentence = getSentenceInput();
        
        // Count the words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count result
        System.out.println("Word count: " + wordCount);
    }

    // Method to get a sentence from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Read the full sentence
        return sentence;
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the sentence is empty
        }
        String[] words = sentence.trim().split("\\s+"); // Split by spaces (handling multiple spaces)
        return words.length; // Return word count
    }
}
 