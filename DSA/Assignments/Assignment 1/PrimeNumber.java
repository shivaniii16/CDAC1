import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } finally {
            sc.close(); // Close the scanner
        }
    }
}
