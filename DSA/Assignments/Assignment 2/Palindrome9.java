import java.util.Scanner;

public class Palindrome9 {

    // Method to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from start and end moving towards the center
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Return false if mismatch is found
            }
            start++;
            end--;
        }
        return true; // Return true if no mismatch is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();  // Get input string from user

        // Check if the input string is a palindrome and print the result
        if (isPalindrome(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close(); // Close the scanner object to avoid memory leak
    }
}
