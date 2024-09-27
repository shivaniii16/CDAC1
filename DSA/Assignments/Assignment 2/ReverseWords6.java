import java.util.Scanner;

public class ReverseWords6{

    // Method to reverse words in a sentence
    public static String reverseWords(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        // Loop through the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i];  // Append each word to the result
            if (i != 0) {
                reversedSentence += " ";  // Add space between words
            }
        }

        return reversedSentence;  // Return the reversed sentence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input sentence from the user
        System.out.print("Enter a sentence to reverse its words: ");
        String input = sc.nextLine();  // Read the input sentence

        // Call the reverseWords method and store the result
        String result = reverseWords(input);

        // Output the reversed words sentence
        System.out.println("Reversed words: " + result);

        sc.close();
    }
}
