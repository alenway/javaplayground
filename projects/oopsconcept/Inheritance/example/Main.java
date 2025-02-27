// Superclass
class Vehicle {
    private String make;
    private String model;

    // constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // methods
    public void displayInfo() {
        System.out.println("Make: " + make + " Model: " + model);
    }

    public void startEngine() {
        System.out.println("Engine Start.");
    }
}

// Subclass
class Car extends Vehicle {
    private int numberOfDoors;

    // constructor
    public Car(String make, String model, int numberofdoors) {
        super(make, model);
        this.numberOfDoors = numberofdoors;
    }

    // methods
    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("toyota", "corrola", 5);
        myCar.displayInfo();
        myCar.displayCarInfo();
    }
}
