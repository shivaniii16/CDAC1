import java.util.Scanner;

public class ReverseString4 {

    // Method to reverse a string
    public static String reverse(String str) {
        String reversed = "";  // Initialize an empty string to store the reversed result

        // Loop through the original string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character to the result
        }

        return reversed;  // Return the reversed string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();  // Read the string input

        // Call the reverse function and store the result
        String result = reverse(input);

        // Output the reversed string
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
