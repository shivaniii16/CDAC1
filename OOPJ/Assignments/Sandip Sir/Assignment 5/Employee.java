public class Employee {
    // Total number of employees
    private static int totalEmployees = 0;

    // Total salary expense for all employees
    private static double totalSalaryExpense = 0;

    // Employee-specific fields
    private int id;       // Employee ID
    private String name;  // Employee name
    private double salary; // Employee salary

    // Constructor to initialize employee details and update total employees and salary expense
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;  // Increment total employees
        totalSalaryExpense += salary;  // Add current employee's salary to total salary
    }

    // Return total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Apply raise to all employees' salaries by adjusting total salary expense
    public static void applyRaise(double percentage) {
        totalSalaryExpense = totalSalaryExpense * (1 + (percentage / 100));  // Adjust total salary by percentage
    }

    // Return total salary expense (including any raises)
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Update individual employee's salary and adjust total salary expense
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;  // Update salary in total salary expense
        this.salary = newSalary;  // Set new salary for this employee
    }

    // Display employee details
    public void getEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    // Main method to test the Employee class functionality
    public static void main(String[] args) {
        // Create two employees
        Employee emp1 = new Employee(101, "Akash", 50000);
        Employee emp2 = new Employee(102, "Shiv", 60000);
        
        // Print their details
        emp1.getEmployeeDetails();
        emp2.getEmployeeDetails();
        
        // Show total employees and salary expense
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: $" + Employee.calculateTotalSalaryExpense());
        
        // Apply 10% raise to all employees
        Employee.applyRaise(10);
        
        // Show updated total salary expense
        System.out.println("Total Salary Expense after 10% raise: $" + Employee.calculateTotalSalaryExpense());
        
        // Update salary for emp1
        emp1.updateSalary(55000);
        System.out.println("Total Salary Expense after emp1's salary update: $" + Employee.calculateTotalSalaryExpense());
    }
}
