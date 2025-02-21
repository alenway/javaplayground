class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog jimmy = new Dog();
        jimmy.eat();
        jimmy.bark();
    }
}
