import java.util.Scanner;

public class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount (₹): ");
        principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term (years): ");
        loanTerm = scanner.nextInt();
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
               (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalAmountPaid = monthlyPayment * loanTerm * 12;
        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid: ₹%.2f\n", totalAmountPaid);
    }

    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}