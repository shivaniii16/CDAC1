// Java program to print a right triangle of stars
public class StarPattern1 {

    // Method to print a right triangle pattern
    public static void printTriangle(int n) {
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numberOfRows = 5;  // Number of rows for the triangle
        printTriangle(numberOfRows);  // Call the method to print the pattern
    }
}