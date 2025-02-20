class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayCarInfo() {
        System.out.printf("Brand: %s, Speed: %d km/h.%n", brand, speed);
    }
}

public class one {
    public static void main(String[] args) {
        Car myCar = new Car("tesla", 320);
        myCar.displayCarInfo();
    }
}
