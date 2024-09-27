import java.util.Scanner;

public class Reverse7 {

    // Method to reverse the digits of a given number
    public static int reverseNumber(int n) {
        int reversed = 0;

        // Continue until the number becomes 0
        while (n != 0) {
            int digit = n % 10;         // Get the last digit of the number
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10;                    // Remove the last digit from the number
        }

        return reversed; // Return the reversed number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();  // Get input number from user

        // Call the reverseNumber function and display the result
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);

        sc.close(); // Close the scanner object to avoid memory leak
    }
}
