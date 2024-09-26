import java.util.Scanner;

public class Fibonacci_4 {
    public static void main(String[] args) {
        System.out.println("Enter no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
