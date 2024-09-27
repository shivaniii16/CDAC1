import java.util.Scanner;

public class RemoveDuplicates2 {

    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;  // If the array is empty, return 0

        int uniqueIndex = 1; // Index to track the position of unique elements

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is not the same as the previous one
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex++] = arr[i]; // Place the unique element in the new position
            }
        }

        return uniqueIndex; // Return the count of unique elements
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Taking input for the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling removeDuplicates function to remove duplicates from the array
        int newLength = removeDuplicates(arr);

        // Output the new length of the
