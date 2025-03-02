class Engine {
    void start() {
        System.out.println("Engine start.");
    }

    void stop() {
        System.out.println("Engine Stop.");
    }
}

class Car {
    // Composition
    private Engine engine;

    // constructor
    public Car() {
        // Composition
        engine = new Engine();
    }

    void start() {
        engine.start();
        System.out.println("Car Engine start.");
    }

    void stop() {
        engine.stop();
        System.out.println("Car Engine stop.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
