import java.util.Scanner;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original price (₹): ");
        originalPrice = scanner.nextDouble();
        System.out.print("Enter discount percentage (%): ");
        discountRate = scanner.nextDouble();
    }

    public double calculateDiscount() {
        return originalPrice * (discountRate / 100);
    }

    public double calculateFinalPrice() {
        double discountAmount = calculateDiscount();
        return originalPrice - discountAmount;
    }

    public void printRecord() {
        double discountAmount = calculateDiscount();
        double finalPrice = calculateFinalPrice();
        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
        System.out.printf("Final Price: ₹%.2f\n", finalPrice);
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}