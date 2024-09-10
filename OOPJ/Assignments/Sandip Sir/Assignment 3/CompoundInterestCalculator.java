import java.util.Scanner;

public class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment amount (₹): ");
        principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();
        System.out.print("Enter investment duration (years): ");
        years = scanner.nextInt();
    }

    public double calculateFutureValue() {
        double ratePerPeriod = annualInterestRate / 100 / numberOfCompounds;
        int totalPeriods = numberOfCompounds * years;
        return principal * Math.pow(1 + ratePerPeriod, totalPeriods);
    }

    public void printRecord() {
        double futureValue = calculateFutureValue();
        double totalInterest = futureValue - principal;
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
    }

    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}