class Vehicle{
    private String make;
    private int year;

    public Vehicle(String make, int year){
        this.make=make;
        this.year=year;
    }
    public String getMake(){
        return make;

    }
    public int getYear(){
        return year;
    }
    public void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle{
    private String model;
    public Car(String make, int year, String model){
     super(make, year);
     this.model=model; 
    }
    public String getModel(){
        return model;
    }
    public void displayDetails() {
        super.displayDetails();  // Call the base class method
        System.out.println("Model: " + model);
    }
}
public class Q2{
    public static void main(String[] args) {
        Car c=new Car("Swift", 2024, "Desire");
        c.displayDetails();
    }
}    



