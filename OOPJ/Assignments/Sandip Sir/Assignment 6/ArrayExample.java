import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        System.out.println("Default values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter 5 integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nUpdated values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        scanner.close();
    }
}