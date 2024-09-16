import java.util.Scanner;

public class ArrayExample_2 {
    
    public static void acceptRecord(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void printRecord(int[] arr) {
        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        
        acceptRecord(arr);
        printRecord(arr);
    }
}
