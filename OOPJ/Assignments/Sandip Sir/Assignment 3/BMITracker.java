import java.util.Scanner;

public class BMITracker {
    private double weight;
    private double height;

    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    @Override
    public String toString() {
        double bmi = calculateBMI();
        String classification = classifyBMI(bmi);
        return String.format("BMI: %.2f\nClassification: %s", bmi, classification);
    }
}

class BMITrackerUtil {
    public static BMITracker acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        return new BMITracker(weight, height);
    }

    public static void printRecord(BMITracker tracker) {
        System.out.println(tracker);
    }

    public static void menuList() {
        System.out.println("1. Calculate BMI");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }
}

public class Ass4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            BMITrackerUtil.menuList();
            int choice = scanner.nextInt();

            if (choice == 1) {
                BMITracker tracker = BMITrackerUtil.acceptRecord();
                BMITrackerUtil.printRecord(tracker);
            } else if (choice == 2) {
                exit = true;
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}