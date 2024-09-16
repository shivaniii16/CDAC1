import java.util.Scanner;

public class Array_7 {
    private int[] arr;  // Field to hold the array

    // Constructor to initialize the array
    public Array_7(int size) {
        arr = new int[size];
    }

    // Method to accept records (input) from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
    }

    // Method to print the state of the array
    public void printRecord() {
        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        // Create an instance of ArrayHandler with array size 5
        Array_7 handler = new Array_7(8);
        
        // Accept records from the user
        handler.acceptRecord();
        
        // Print the state of the array
        handler.printRecord();
    }
}
