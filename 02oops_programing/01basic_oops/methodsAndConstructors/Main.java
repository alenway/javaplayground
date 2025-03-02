class Engine {
    // private variable
    private int value;

    // Default constructor
    public Engine() {
        this.value = 0;
    }

    // Parameterized constructor
    public Engine(int value) {
        this.value = value;
    }

    // Override the toString method to print the value
    @Override
    public String toString() {
        return "Engine{value=" + value + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        System.out.println(myEngine); // Output: Engine{value=0}

        Engine myEngine2 = new Engine(90);
        System.out.println(myEngine2); // Output: Engine{value=90}
    }
}
