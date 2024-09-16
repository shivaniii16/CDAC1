import java.util.Scanner;

public class Array_8 {
    private int[] arr;  // Field to hold the array

    // Constructor to initialize the array
    public Array_8(int size) {
        arr = new int[size];
    }

    // Setter method to update the array values
    public void setArray(int[] newArr) {
        if (newArr.length == arr.length) {
            arr = newArr;
        } else {
            System.out.println("Error: Array size mismatch.");
        }
    }

    // Getter method to retrieve the array values
    public int[] getArray() {
        return arr;
    }

    // Method to accept records (input) from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[arr.length];
        System.out.println("Enter " + arr.length + " integers to update the array:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            inputArray[i] = scanner.nextInt();
        }
        setArray(inputArray);
    }

    // Method to print the state of the array
    public void printRecord() {
        int[] array = getArray();
        System.out.println("Array values:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }
    }

    public static void main(String[] args) {
        // Create an instance of Array_8 with array size 5
        Array_8 handler = new Array_8(5);
        
        // Accept records from the user
        handler.acceptRecord();
        
        // Print the state of the array
        handler.printRecord();
    }
}
