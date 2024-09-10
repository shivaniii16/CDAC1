import java.util.Scanner;

public class BMITracker {
    private double weight;
    private double height;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        height = scanner.nextDouble();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        double bmi = calculateBMI();
        String classification = classifyBMI(bmi);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Classification: " + classification);
    }

    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.printRecord();
    }
}